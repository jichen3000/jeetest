/*
 * Copyright 2010 Oracle and/or its affiliates.
 * All rights reserved.  You may not modify, use,
 * reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://developer.sun.com/berkeley_license.html
 */

package colin.lazyload;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.LazyDataModel;

import colin.deletechild.DadEntity;
import colin.deletechild.DadService;



@ManagedBean(name = "dadLazyBean")
@SessionScoped
public class DadLazyBean {
	@EJB
	private DadService dadService;
	private DadEntity current;
	private LazyDataModel<DadEntity> dadList; 
	
	public LazyDataModel<DadEntity> getDadList(){
		System.out.println("dadList:"+dadList);
		System.out.println("dadList getRowCount:"+dadList.getRowCount());
//		System.out.println("dadList getRowData:"+dadList.getRowData());
		return dadList;
	}
	
	@PostConstruct
	public void init(){
		dadList=new DadLazyList(dadService);
		System.out.println("dadList load:"+dadList.load(0, 3, "", false, null));
	}
	
	public DadEntity getCurrent() {
		return current;
	}

	public void setCurrent(DadEntity current) {
		this.current = current;
	}

	public void genTestDate(){
		dadService.genTestDate();
	}


	public DadLazyBean() {
	}

	

	public DadService getDadService() {
		return dadService;
	}


	public void setDadService(DadService dadService) {
		this.dadService = dadService;
	}





	

}
