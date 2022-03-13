package day5;

public class Reverse {

	public static void main(String[] args) {
	int num =121, reverse=0;
	System.out.println(num);
	while(num!=0)
	{
		
		int remainder = num%10;
		reverse = reverse*10 + remainder;
		num = num/10;	
		}
	if(reverse == num)
	{
		System.out.println("is a palindrome");
	}
	else
	{
		System.out.println("is a not palindrome");
	}
	}

}
