package colin.checkcontinuity;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ContinuityTest {
	@Before 
	public void setUp(){
	}
	
	private Date newDate(String dateString){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date newDate = null;
		try {
			newDate = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newDate;
	}
	

	@Test
	public void testAddDay() throws ParseException{
		String first = "2008-01-01 12:00:00";  
		String second = "2008-01-04 12:00:00";  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Calendar other = Calendar.getInstance();
		cal.setTime(sdf.parse(first));
		cal.add(Calendar.DATE, 3);
		other.setTime(sdf.parse(second));
		assertTrue(other.compareTo(cal)==0);
	}
	@Test
	public void testCheckContinuityByLong(){
		String type = "123";
		List<PerdiemByVolumn> list = new ArrayList<PerdiemByVolumn>();
		list.add(new PerdiemByVolumn(type,100,150));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		type = "456";
		list.add(new PerdiemByVolumn(type,100,150));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		assertTrue(Continuity.checkContinuity(list));
	}
	@Test
	public void testCheckContinuityByLongWithIntersectData(){
		String type = "123";
		List<PerdiemByVolumn> list = new ArrayList<PerdiemByVolumn>();
		list.add(new PerdiemByVolumn(type,100,150));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		type = "456";
		list.add(new PerdiemByVolumn(type,100,156));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		assertTrue(!Continuity.checkContinuity(list));
	}
	@Test
	public void testCheckContinuityByDate(){
		String type = "123";
		List<PerdiemByDate> list = new ArrayList<PerdiemByDate>();
		list.add(new PerdiemByDate(type,newDate("2008-01-01"),newDate("2008-03-01")));
		list.add(new PerdiemByDate(type,newDate("2008-03-02"),newDate("2008-05-31")));
		list.add(new PerdiemByDate(type,newDate("2008-06-01"),newDate("2009-03-01")));
		type = "456";
		list.add(new PerdiemByDate(type,newDate("2008-01-01"),newDate("2008-03-01")));
		list.add(new PerdiemByDate(type,newDate("2008-03-02"),newDate("2008-12-31")));
		list.add(new PerdiemByDate(type,newDate("2009-01-01"),newDate("2009-03-01")));
		assertTrue(Continuity.checkContinuity(list));
	}
	@Test
	public void testCheckContinuityByDateWithIntersectData(){
		String type = "123";
		List<PerdiemByDate> list = new ArrayList<PerdiemByDate>();
		list.add(new PerdiemByDate(type,newDate("2008-01-01"),newDate("2008-03-01")));
		list.add(new PerdiemByDate(type,newDate("2008-03-02"),newDate("2008-05-31")));
		list.add(new PerdiemByDate(type,newDate("2008-06-02"),newDate("2009-03-01")));
		type = "456";
		list.add(new PerdiemByDate(type,newDate("2008-01-01"),newDate("2008-03-01")));
		list.add(new PerdiemByDate(type,newDate("2008-03-02"),newDate("2008-12-31")));
		list.add(new PerdiemByDate(type,newDate("2009-01-01"),newDate("2009-03-01")));
		assertTrue(!Continuity.checkContinuity(list));
	}
	@Test
	public void testGetUncontinuityList(){
		String type = "123";
		List<PerdiemByVolumn> list = new ArrayList<PerdiemByVolumn>();
		list.add(new PerdiemByVolumn(type,100,150));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		type = "456";
		list.add(new PerdiemByVolumn(type,100,150));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		assertTrue(Continuity.getUncontinuityList(list).size()==0);
	}
	
	@Test
	public void testGetUncontinuityListWithIntersectData(){
		String type = "123";
		List<PerdiemByVolumn> list = new ArrayList<PerdiemByVolumn>();
		list.add(new PerdiemByVolumn(type,100,150));
		list.add(new PerdiemByVolumn(type,151,200));
		list.add(new PerdiemByVolumn(type,201,9999));
		type = "456";
		list.add(new PerdiemByVolumn(type,100,156));
		PerdiemByVolumn problem = new PerdiemByVolumn(type,151,200);
		list.add(problem);
		list.add(new PerdiemByVolumn(type,201,9999));
		assertTrue(Continuity.getUncontinuityList(list).get(0).getId().equals(problem.getId()));
	}
	
	@Test
	public void testCompareToByDate(){
		String type = "123";
		String type2 = "456";
		
		List<PerdiemByDate> list = new ArrayList<PerdiemByDate>();
		PerdiemByDate p1 = new PerdiemByDate(type,newDate("2008-06-01"),newDate("2009-03-01"));
		PerdiemByDate p2 = new PerdiemByDate(type2,newDate("2008-01-01"),newDate("2008-03-01"));
		PerdiemByDate p3 = new PerdiemByDate(type,newDate("2008-01-01"),newDate("2008-03-01"));
		PerdiemByDate p4 = new PerdiemByDate(type2,newDate("2008-03-02"),newDate("2008-05-31"));
		PerdiemByDate p5 = new PerdiemByDate(type,newDate("2008-03-02"),newDate("2008-05-31"));
		PerdiemByDate p6 = new PerdiemByDate(type2,newDate("2008-06-01"),newDate("2009-03-01"));
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		
		Collections.sort(list);
		assertTrue(list.get(0).getId().equals(p3.getId()));
		assertTrue(list.get(1).getId().equals(p5.getId()));
		assertTrue(list.get(2).getId().equals(p1.getId()));
		assertTrue(list.get(3).getId().equals(p2.getId()));
		assertTrue(list.get(4).getId().equals(p4.getId()));
		assertTrue(list.get(5).getId().equals(p6.getId()));
	}
	@Test
	public void testCompareToByLong(){
		String type = "123";
		String type2 = "456";
		
		List<PerdiemByVolumn> list = new ArrayList<PerdiemByVolumn>();
		PerdiemByVolumn p1 = new PerdiemByVolumn(type,201,9999);
		PerdiemByVolumn p2 = new PerdiemByVolumn(type2,100,156);
		PerdiemByVolumn p3 = new PerdiemByVolumn(type,100,150);
		PerdiemByVolumn p4 = new PerdiemByVolumn(type2,151,200);
		PerdiemByVolumn p5 = new PerdiemByVolumn(type,151,200);
		PerdiemByVolumn p6 = new PerdiemByVolumn(type2,201,9999);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		
		Collections.sort(list);
		assertTrue(list.get(0).getId().equals(p3.getId()));
		assertTrue(list.get(1).getId().equals(p5.getId()));
		assertTrue(list.get(2).getId().equals(p1.getId()));
		assertTrue(list.get(3).getId().equals(p2.getId()));
		assertTrue(list.get(4).getId().equals(p4.getId()));
		assertTrue(list.get(5).getId().equals(p6.getId()));
	}
}
