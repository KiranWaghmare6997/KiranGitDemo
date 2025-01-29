package GitHub_Demo;

public class c_PalindromeNumber 
{
	public static void main(String[] args) 
	{
		// check whether the number is palindrome or not..
		
		// 121 -> 121 => palindrome   ||  124 =! 421 => not palindrome
		
		int num=525;
		
		int sum,rem;
		
		for(sum=0;num>0;num=num/10)
		{
			rem=num%10;
			
			sum=sum*10+rem;
		}
		
//		System.out.println(sum);
		
		if(sum==525)
		{
			System.out.println(sum+" is palindrome number");
		}
		else
		{
			System.out.println(num+" is not palindrome number");
		}
		
	}

}
