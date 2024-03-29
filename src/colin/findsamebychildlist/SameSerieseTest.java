package colin.findsamebychildlist;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SameSerieseTest {
	@Before 
	public void setUp(){
	}
	
	
	@Test
	public void testCheckListInSameSeriese(){
		String type = "123";
		List<Perdiem> firstList = new ArrayList<Perdiem>();
		firstList.add(new Perdiem(type,100,150));
		firstList.add(new Perdiem(type,151,200));
		firstList.add(new Perdiem(type,201,9999));
		List<Perdiem> secondList = new ArrayList<Perdiem>();
		secondList.add(new Perdiem(type,100,150));
		secondList.add(new Perdiem(type,151,200));
		secondList.add(new Perdiem(type,201,9999));
		assertTrue(SameSeriese.checkSortedListInSameSeriese(firstList,secondList));
	}
	@Test
	public void testCheckListInSameSerieseWithFalseConditions(){
		String type = "123";
		List<Perdiem> firstList = new ArrayList<Perdiem>();
		firstList.add(new Perdiem(type,100,150));
		firstList.add(new Perdiem(type,151,200));
		firstList.add(new Perdiem(type,201,9999));
		List<Perdiem> secondList = new ArrayList<Perdiem>();
		secondList.add(new Perdiem(type,100,150));
		secondList.add(new Perdiem(type,151,200));
		assertTrue(!SameSeriese.checkSortedListInSameSeriese(firstList,secondList));
		secondList.add(new Perdiem("345",201,9999));
		assertTrue(!SameSeriese.checkSortedListInSameSeriese(firstList,secondList));
	}
	@Test
	public void testCheckUnsortedListInSameSeriese(){
		List<Perdiem> firstList = new ArrayList<Perdiem>();
		firstList.add(new Perdiem("123",100,150));
		firstList.add(new Perdiem("789",151,200));
		firstList.add(new Perdiem("456",201,9999));
		List<Perdiem> secondList = new ArrayList<Perdiem>();
		secondList.add(new Perdiem("789",100,150));
		secondList.add(new Perdiem("456",151,200));
		secondList.add(new Perdiem("123",201,9999));
		assertTrue(SameSeriese.checkUnsortedListInSameSeriese(firstList,secondList));
	}
	@Test
	public void testCheckSameSeriese(){
		Contract contract1 = new Contract();
		contract1.addPrediem(new Perdiem("123",100,150));
		contract1.addPrediem(new Perdiem("789",151,200));
		contract1.addPrediem(new Perdiem("456",201,9999));
		Contract contract2 = new Contract();
		contract2.addPrediem(new Perdiem("789",100,150));
		contract2.addPrediem(new Perdiem("456",151,200));
		contract2.addPrediem(new Perdiem("123",201,9999));
		assertTrue(contract1.checkSameSeriese(contract2));
	}
}
