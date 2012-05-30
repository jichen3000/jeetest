package colin.commandialog;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import colin.common.AbstractService;

@Stateless
public class PublisherCodeService extends AbstractService<PublisherCodeEntity>{
	public PublisherCodeService() {
		super(PublisherCodeEntity.class);
	}

	@PersistenceContext(unitName = "jeetest")
	private EntityManager entityManager;


	public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<PublisherCodeEntity> search(PublisherCodeEntity param) {
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
		Root from = criteriaQuery.from(PublisherCodeEntity.class);
		if (param.getCode() != null & !param.getCode().equals("")) {
			Predicate condition = criteriaBuilder.like(from.get("code"),
					criteriaBuilder.literal("%" + param.getCode() + "%"));
			criteriaQuery.where(condition);
		}
		if (param.getName() != null & !param.getName().equals("")) {
			Predicate namecondition = criteriaBuilder.like(from.get("name"),
					criteriaBuilder.literal("%" + (String) param.getName() + "%"));
			criteriaQuery.where(namecondition);
		}
		return getEntityManager().createQuery(criteriaQuery).getResultList();
	}

}
