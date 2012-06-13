package colin.findsamebychildlist;

public interface SameSeriesable<T> {
	// select father.name, count(child.name) child_count from father, child
	// where child.father_id = father.id having child_count = ?
	public boolean isInSameSeries(T other);
}
