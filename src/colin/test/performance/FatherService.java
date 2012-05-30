package colin.test.performance;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import colin.common.AbstractService;
import colin.test.performance.entities.ChildA;
import colin.test.performance.entities.ChildB;
import colin.test.performance.entities.ChildC;
import colin.test.performance.entities.ChildD;
import colin.test.performance.entities.ChildE;
import colin.test.performance.entities.Father;
import colin.test.performance.entities.GrandsonAA;
import colin.test.performance.entities.GrandsonAB;
import colin.test.performance.entities.GrandsonAC;
import colin.test.performance.entities.GrandsonAD;
import colin.test.performance.entities.GrandsonAE;
import colin.test.performance.entities.GrandsonBA;
import colin.test.performance.entities.GrandsonBB;
import colin.test.performance.entities.GrandsonBC;
import colin.test.performance.entities.GrandsonBD;
import colin.test.performance.entities.GrandsonBE;
import colin.test.performance.entities.GrandsonCA;
import colin.test.performance.entities.GrandsonCB;
import colin.test.performance.entities.GrandsonCC;
import colin.test.performance.entities.GrandsonCD;
import colin.test.performance.entities.GrandsonCE;
import colin.test.performance.entities.GrandsonDA;
import colin.test.performance.entities.GrandsonDB;
import colin.test.performance.entities.GrandsonDC;
import colin.test.performance.entities.GrandsonDD;
import colin.test.performance.entities.GrandsonDE;
import colin.test.performance.entities.GrandsonEA;
import colin.test.performance.entities.GrandsonEB;
import colin.test.performance.entities.GrandsonEC;
import colin.test.performance.entities.GrandsonED;
import colin.test.performance.entities.GrandsonEE;

@Stateless
public class FatherService extends AbstractService<Father>{
	public FatherService() {
		super(Father.class);
	}
	@PersistenceContext(unitName = "jeetest")
	private EntityManager entityManager;


	public EntityManager getEntityManager() {
		return entityManager;
	}
	private ChildA genNewChildA(String seed){
		ChildA childA0 = new ChildA(seed);
		childA0.addGrandsonAA(new GrandsonAA(seed+"GrandsonAA00"));
		childA0.addGrandsonAA(new GrandsonAA(seed+"GrandsonAA01"));
		
		childA0.addGrandsonAB(new GrandsonAB(seed+"GrandsonAB00"));
		childA0.addGrandsonAB(new GrandsonAB(seed+"GrandsonAB01"));
		
		childA0.addGrandsonAC(new GrandsonAC(seed+"GrandsonAC00"));
		childA0.addGrandsonAC(new GrandsonAC(seed+"GrandsonAC01"));
		
		childA0.addGrandsonAD(new GrandsonAD(seed+"GrandsonAD00"));
		childA0.addGrandsonAD(new GrandsonAD(seed+"GrandsonAD01"));
		
		childA0.addGrandsonAE(new GrandsonAE(seed+"GrandsonAE00"));
		childA0.addGrandsonAE(new GrandsonAE(seed+"GrandsonAE01"));
		
		return childA0;
	}
	
	private ChildB genNewChildB(String seed){
		ChildB childB0 = new ChildB(seed);
		childB0.addGrandsonBA(new GrandsonBA(seed+"GrandsonBA00"));
		childB0.addGrandsonBA(new GrandsonBA(seed+"GrandsonBA01"));
		
		childB0.addGrandsonBB(new GrandsonBB(seed+"GrandsonBB00"));
		childB0.addGrandsonBB(new GrandsonBB(seed+"GrandsonBB01"));
		
		childB0.addGrandsonBC(new GrandsonBC(seed+"GrandsonBC00"));
		childB0.addGrandsonBC(new GrandsonBC(seed+"GrandsonBC01"));
		
		childB0.addGrandsonBD(new GrandsonBD(seed+"GrandsonBD00"));
		childB0.addGrandsonBD(new GrandsonBD(seed+"GrandsonBD01"));
		
		childB0.addGrandsonBE(new GrandsonBE(seed+"GrandsonBE00"));
		childB0.addGrandsonBE(new GrandsonBE(seed+"GrandsonBE01"));
		
		return childB0;
	}
  

	private ChildC genNewChildC(String seed){
		ChildC childC0 = new ChildC(seed);
		childC0.addGrandsonCA(new GrandsonCA(seed+"GrandsonCA00"));
		childC0.addGrandsonCA(new GrandsonCA(seed+"GrandsonCA01"));
		
		childC0.addGrandsonCB(new GrandsonCB(seed+"GrandsonCB00"));
		childC0.addGrandsonCB(new GrandsonCB(seed+"GrandsonCB01"));
		
		childC0.addGrandsonCC(new GrandsonCC(seed+"GrandsonCC00"));
		childC0.addGrandsonCC(new GrandsonCC(seed+"GrandsonCC01"));
		
		childC0.addGrandsonCD(new GrandsonCD(seed+"GrandsonCD00"));
		childC0.addGrandsonCD(new GrandsonCD(seed+"GrandsonCD01"));
		
		childC0.addGrandsonCE(new GrandsonCE(seed+"GrandsonCE00"));
		childC0.addGrandsonCE(new GrandsonCE(seed+"GrandsonCE01"));
				
		return childC0;
	}
  

	private ChildD genNewChildD(String seed){
		ChildD childD0 = new ChildD(seed);
		childD0.addGrandsonDA(new GrandsonDA(seed+"GrandsonDA00"));
		childD0.addGrandsonDA(new GrandsonDA(seed+"GrandsonDA01"));
		
		childD0.addGrandsonDB(new GrandsonDB(seed+"GrandsonDB00"));
		childD0.addGrandsonDB(new GrandsonDB(seed+"GrandsonDB01"));
		
		childD0.addGrandsonDC(new GrandsonDC(seed+"GrandsonDC00"));
		childD0.addGrandsonDC(new GrandsonDC(seed+"GrandsonDC01"));
		
		childD0.addGrandsonDD(new GrandsonDD(seed+"GrandsonDD00"));
		childD0.addGrandsonDD(new GrandsonDD(seed+"GrandsonDD01"));
		
		childD0.addGrandsonDE(new GrandsonDE(seed+"GrandsonDE00"));
		childD0.addGrandsonDE(new GrandsonDE(seed+"GrandsonDE01"));
				
		return childD0;
	}
  

	private ChildE genNewChildE(String seed){
		ChildE childE0 = new ChildE(seed);
		childE0.addGrandsonEA(new GrandsonEA(seed+"GrandsonEA00"));
		childE0.addGrandsonEA(new GrandsonEA(seed+"GrandsonEA01"));
		
		childE0.addGrandsonEB(new GrandsonEB(seed+"GrandsonEB00"));
		childE0.addGrandsonEB(new GrandsonEB(seed+"GrandsonEB01"));
		
		childE0.addGrandsonEC(new GrandsonEC(seed+"GrandsonEC00"));
		childE0.addGrandsonEC(new GrandsonEC(seed+"GrandsonEC01"));
		
		childE0.addGrandsonED(new GrandsonED(seed+"GrandsonED00"));
		childE0.addGrandsonED(new GrandsonED(seed+"GrandsonED01"));
		
		childE0.addGrandsonEE(new GrandsonEE(seed+"GrandsonEE00"));
		childE0.addGrandsonEE(new GrandsonEE(seed+"GrandsonEE01"));
		
		return childE0;
	}
  

	public Father genNewOne(){
		
		Father father = new Father("father");
		father.addChildA(genNewChildA("childa0"));
		father.addChildA(genNewChildA("childa1"));
		
		father.addChildB(genNewChildB("childa0"));
		father.addChildB(genNewChildB("childa1"));  

		father.addChildC(genNewChildC("childa0"));
		father.addChildC(genNewChildC("childa1"));  

		father.addChildD(genNewChildD("childa0"));
		father.addChildD(genNewChildD("childa1"));  

		father.addChildE(genNewChildE("childa0"));
		father.addChildE(genNewChildE("childa1"));  

		return father;
	}
	
	public void testPerformance(){

		long start = 0;
		long elapsedTimeMillis = 0;
		long total = 0;
		int count = 100;
		int step = 0;
		if (count > 10){
			step = count / 10;
		}
		for(int i = 1; i<count+1; i++){
			Father father = genNewOne();
			start = System.currentTimeMillis();		
			
			this.save(father);
			elapsedTimeMillis = System.currentTimeMillis()-start;
			total = total + elapsedTimeMillis;
			if((step > 0) && (i % step)==0){
				System.out.println(i+" , time(millisecond) is: "+total);
			}
		}
		System.out.println("use direct tables and count is "+count);
		float second = total/1000F;
		System.out.println("total time(second) is: "+second);		
	}


	
}
