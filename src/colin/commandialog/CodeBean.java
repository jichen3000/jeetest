package colin.commandialog;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean(name = "codeBean")
@RequestScoped
public class CodeBean {
	@Inject
	private TypeCodeEntity searchTypeCodeParam;

	
	public TypeCodeEntity getSearchTypeCodeParam() {
		return searchTypeCodeParam;
	}
	public void setSearchTypeCodeParam(TypeCodeEntity searchTypeCodeParam) {
		this.searchTypeCodeParam = searchTypeCodeParam;
	}
	public void searchTypeCode(){
		System.out.println("searchTypeCode...");
		this.typeCodeList = this.typeCodeService.search(searchTypeCodeParam);
		System.out.println("typeCodeList..."+typeCodeList);
	}

	List<TypeCodeEntity> typeCodeList;
	@EJB
	private TypeCodeService typeCodeService;
	public List<TypeCodeEntity> getTypeCodeList(){
		System.out.println("getTypeCodeList...");
		if(typeCodeList==null){
			typeCodeList = typeCodeService.findAll();
		}
		return typeCodeList;
	}
	
	
	public void showTypeCodeDialog(){
		System.out.println("showTypeCodeDialog...");
	}

}
