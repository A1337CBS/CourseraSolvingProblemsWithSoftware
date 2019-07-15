//Finding a Gene - Using Simplified Algorithm
public class Part2 {
	
	public static String findSimpleGene(String dna, int startIndex, int stopIndex)
	{
		//startIndex = dna.indexOf("ATG");
		//stopIndex = dna.indexOf("TAA");
		boolean upperCase = false;
		if (dna.toUpperCase() == dna)
		{
			upperCase = true;
		}
		
		if (startIndex == -1) 
		{
			return "";
		}
		if (stopIndex == -1) 
		{
			return "";
		}
		if (dna.substring(startIndex, stopIndex+3).length()%3==0)
		{
			if (upperCase)
			{
				return dna.substring(startIndex, stopIndex+3).toUpperCase();
			}
			else
			{
				return dna.substring(startIndex, stopIndex+3).toLowerCase();
			}
		}
		
		return "";
	}
	
	public static void testSimpleGene() {
		System.out.println(findSimpleGene("ATGAGBTAA",0,6));
		System.out.println(findSimpleGene("TAA",0,0));
		System.out.println(findSimpleGene("ATG",0,0));
		System.out.println(findSimpleGene("ATGGBTAA",0,0));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running testSimpleGene");
		testSimpleGene();
		

	}

}
