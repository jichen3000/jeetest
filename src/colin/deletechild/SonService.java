package colin.deletechild;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import colin.common.AbstractService;

@Stateless
public class SonService extends AbstractService<SonEntity>{
	public SonService() {
		super(SonEntity.class);
	}
	@PersistenceContext(unitName = "jeetest")
	private EntityManager entityManager;


	public EntityManager getEntityManager() {
		return entityManager;
	}

	

	
	



	
}
