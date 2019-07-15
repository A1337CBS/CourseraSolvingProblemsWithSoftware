//Finding a Gene - Using Simplified Algorithm
//Java Programming: Solving Problems with Software
public class Part1 {
	
	public static String findSimpleGene(String dna)
	{
		int startIndex = dna.indexOf("ATG");
		int stopIndex = dna.indexOf("TAA", startIndex+3);
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
			return dna.substring(startIndex, stopIndex+3);
		}
		
		return "";
	}
	
	public static void testSimpleGene() {
		System.out.println(findSimpleGene("AAATGCCCTAACTAGATTAAGAAACC"));
		System.out.println(findSimpleGene("TAA"));
		System.out.println(findSimpleGene("ATG"));
		System.out.println(findSimpleGene("ATGGBTAA"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running testSimpleGene");
		testSimpleGene();
		

	}

}
