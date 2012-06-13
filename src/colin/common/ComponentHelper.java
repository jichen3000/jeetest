package colin.common;

public class ComponentHelper {
	public static String getSubClientId(String fullClientId, String posId){
		int pos = fullClientId.lastIndexOf(posId);
		return fullClientId.substring(0,pos)+posId;
	}
}
