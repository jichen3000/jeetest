package colin.checkcontinuity;

public interface RangeContinuity<T, G> {
	public G getRangeFrom();
	public G getRangeTo();
	public boolean isInSameSeries(T other);
}
