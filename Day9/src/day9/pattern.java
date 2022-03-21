package day9;

public class pattern {

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
		

	}

} 


/*output will be 
 * 
 * 
**printing the pattern**
A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U              */
