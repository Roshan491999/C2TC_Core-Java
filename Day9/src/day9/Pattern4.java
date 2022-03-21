package day9;

public class Pattern4 {
	
	public static void main(String[] args)
	{
		int i,j, alphabet = 65;
		
		System.out.println("**printing the pattern**");
		
		for(i=0; i<=5; i++)
		{
			for(j=0; j<=i; j++) 
			{
				
				System.out.print((char) alphabet +" ");
				alphabet++;
			}
			
			System.out.println();
		}
		
		for(i=0; i>=0; i--)
		{
			alphabet =65;
			for(j=0; j<=i-1; j++) 
			{
				
				System.out.println((char) (alphabet + j)+" ");
				alphabet++;
			}
			
			System.out.println();
		
		}	
	
	}

}
