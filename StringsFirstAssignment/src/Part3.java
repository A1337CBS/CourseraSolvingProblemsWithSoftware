/**
 * @author Ahmad
 *
 */
public class Part3 {

	/**
	 * @param args
	 */
	
	public static boolean twoOccurences(String stringa, String stringb)
	{
		int firstOccurence = stringb.indexOf(stringa);
		int secondOccurence = stringb.indexOf(stringa, firstOccurence+3);
		if (secondOccurence!=-1)
		{
			return true;
		}
		return false;
	}
	
	public static void testing()
	{
		System.out.println("String is A story by Abby Long and by");
		System.out.println(twoOccurences("by", "A story by Abby Long") );
		System.out.println("String is banana and a");
		System.out.println(twoOccurences("a", "banana") );
		System.out.println("String is ctgtatgta and atg");
		System.out.println(twoOccurences("atg", "ctgtatgta") );
	}
	
	public static String lastPart(String stringa, String stringb)
	{
		int firstOccurence = stringb.indexOf(stringa);
		if (firstOccurence!=-1)
		{
			String result = stringb.substring(firstOccurence+stringa.length());
			return result;
		}
		return stringb;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testing();
		System.out.println(lastPart("an","banana"));
		System.out.println(lastPart("zoo","forest"));
		
	}

}
