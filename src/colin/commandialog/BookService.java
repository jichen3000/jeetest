package colin.commandialog;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import colin.common.AbstractService;

@Stateless
public class BookService extends AbstractService<BookEntity> {
	public BookService() {
		super(BookEntity.class);
	}

	@PersistenceContext(unitName = "jeetest")
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
