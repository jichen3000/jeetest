package colin.checkcontinuity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Continuity {
	private static <G> boolean isNotNext(G preValue, G nextValue){
		if(preValue instanceof Long){
			Long pre = (Long)preValue;
			Long next = (Long)nextValue;
			return isNotNextImplement(pre,next);
		}
		if(preValue instanceof Date){
			Date pre = (Date)preValue;
			Date next = (Date)nextValue;
			return isNotNextImplement(pre,next);
		}
		return false;
	}
	private static boolean isNotNextImplement(Long preValue, Long nextValue){
		return (preValue+1)!=nextValue;
	}
	private static boolean isNotNextImplement(Date preValue, Date nextValue){
		Calendar pre = Calendar.getInstance();
		Calendar next = Calendar.getInstance();
		pre.setTime(preValue);
		next.setTime(nextValue);
		pre.add(Calendar.DATE, 1);		
		return pre.compareTo(next)!=0;
	}
	public static <T extends RangeContinuity<T, G>, G> boolean checkContinuity(List<T> objectList){
		int index = 0;
		T preItem = null;
		T preSeriesItem = objectList.get(index);
		for (T item : objectList) {
			if(index>0){
				if(item.isInSameSeries(preSeriesItem)){
					if(Continuity.isNotNext(preItem.getRangeTo(),item.getRangeFrom())){
						return false;
					}
				}else{
					preSeriesItem = item;
				}
			}
			preItem = item;
			index++;
		}
		return true;
	}
	
	public static <T extends RangeContinuity<T, G>, G> List<T> getUncontinuityList(List<T> objectList){
		int index = 0;
		T preItem = null;
		T preSeriesItem = objectList.get(index);
		List<T> uncontinuityList = new ArrayList<T>();
		for (T item : objectList) {
			if(index>0){
				if(item.isInSameSeries(preSeriesItem)){
					if(Continuity.isNotNext(preItem.getRangeTo(),item.getRangeFrom())){
						uncontinuityList.add(item);
					}
				}else{
					preSeriesItem = item;
				}
			}
			preItem = item;
			index++;
		}
		return uncontinuityList;
	}
	
}
