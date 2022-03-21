package day9;

public class Starpattern {
	public static void main(String[] args)
	{
		int i,j;
		
		System.out.println("printing the pattern");
		
		for(i=0; i<=5; i++)
		{
			for(j=0; j<=i; j++) 
			{
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		

	}
}

/*
 *OUTPUT
printing the pattern
*
**
***
****
*****
******
*/