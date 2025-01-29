package GitHub_Demo;

public class b_SumOfDigits 
{
	public static void main(String[] args) 
	{
		int number=2345;
		
		int sum;
		
		for(sum=0;number>0;number=number/10)
		{
			sum=sum+number%10;
		}
		
		System.out.println(sum);
	}

}
