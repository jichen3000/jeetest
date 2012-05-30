package colin.common;

public class SequenceHelper {
	private static long seq = 0;
	public static Long genID(){
		long start = System.currentTimeMillis();
		seq++;
		return new Long(start+seq);
	}
	public static Long genSimpleID(){
		seq++;
		return new Long(seq);
	}
}
