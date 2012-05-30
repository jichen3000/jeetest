package colin.test.performance;

import java.io.IOException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import colin.common.AbstractService;
import colin.test.performance.entities.Father;
import colin.test.performance.entities.FatherClob;
@Stateless
public class FatherClobService extends AbstractService<FatherClob>{
	public FatherClobService() {
		super(FatherClob.class);
	}
	@PersistenceContext(unitName = "jeetest")
	private EntityManager entityManager;
	@EJB
	private FatherService fatherService;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	
	public void setJson(ObjectMapper mapper, FatherClob fatherClob, Father father){
		String clob = null;
		try {
			clob = mapper.writeValueAsString(father);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		fatherClob.setContent(clob);
	}
	
	public void testPerformance(){
		long start = 0;
		long elapsedTimeMillis = 0;
		long setJsonTotal = 0;
		long saveTotal = 0;
		long total = 0;
		int count = 100;
		int step = 0;
		if (count > 10){
			step = count / 10;
		}
		ObjectMapper mapper = new ObjectMapper();
		for(int i = 1; i<count+1; i++){
			FatherClob fatherClob = new FatherClob("FatherClob");
			Father father = fatherService.genNewOne();
			start = System.currentTimeMillis();		
			setJson(mapper,fatherClob,father);
			elapsedTimeMillis = System.currentTimeMillis()-start;
			setJsonTotal = setJsonTotal + elapsedTimeMillis;
			
			start = System.currentTimeMillis();		
			this.save(fatherClob);
			elapsedTimeMillis = System.currentTimeMillis()-start;
			saveTotal = saveTotal + elapsedTimeMillis;
			total = saveTotal + setJsonTotal;
			if((step > 0) && (i % step)==0){
				System.out.println(i+" , time(millisecond) is: "+total);
			}
		}
		System.out.println("use json and count is "+count);
		float second = setJsonTotal/1000F;
		System.out.println("total trans json time(second) is: "+second);		
		second = saveTotal/1000F;
		System.out.println("total save to db time(second) is: "+second);		
		second = total/1000F;
		System.out.println("total time(second) is: "+second);		
	}


	
}
