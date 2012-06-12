package colin.deletechild;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import colin.common.AbstractService;

@Stateless
public class DadService extends AbstractService<DadEntity>{
	public DadService() {
		super(DadEntity.class);
	}
	@PersistenceContext(unitName = "jeetest")
	private EntityManager entityManager;


	public EntityManager getEntityManager() {
		return entityManager;
	}

	
	public DadEntity genNewOne(){
		
		DadEntity dad = new DadEntity("colin");
		dad.addSon(new SonEntity("c1"));
		dad.addSon(new SonEntity("c2"));

		return dad;
	}
	
	public void genTestDate(){
		for(int i=0; i<10; i++){
			DadEntity dad = new DadEntity();
			this.save(dad);
		}
	}
	
	



	
}
