package colin.findsamebychildlist;

import java.util.List;

public class SameSeriese {
	public static <T extends SameSeriesable<T>> boolean checkListInSameSeriese(
			List<T> first, List<T> second) {
		if (first == null || second == null || first.size() != second.size()) {
			return false;
		}
		for (int i = 0; i < first.size(); i++) {
			if (!first.get(i).isInSameSeries(second.get(i))) {
				return false;
			}
		}
		return true;
	}
}
