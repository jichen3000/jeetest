package colin.findsamebychildlist;

import java.util.Collections;
import java.util.List;

public class SameSeriese {
	public static <T extends SameSeriesable<T>> boolean checkSortedListInSameSeriese(
			List<T> firstList, List<T> secondList) {
		if (firstList == null || secondList == null || firstList.size() != secondList.size()) {
			return false;
		}
		for (int i = 0; i < firstList.size(); i++) {
			if (!firstList.get(i).isInSameSeries(secondList.get(i))) {
				return false;
			}
		}
		return true;
	}
	// notice: this method will change your list to a sorted list, which means side effect.
	public static <T extends SameSeriesable<T>> boolean checkUnsortedListInSameSeriese(
			List<T> firstList, List<T> secondList) {
		if (firstList == null || secondList == null || firstList.size() != secondList.size()) {
			return false;
		}
		Collections.sort(firstList);
		Collections.sort(secondList);
		return checkSortedListInSameSeriese(firstList,secondList);
	}
}
