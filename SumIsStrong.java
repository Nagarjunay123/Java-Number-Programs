class SumIsStrong 
{
	public static void main(String[] args) 
	{
		/////Sum of the given number and ckecks that number is strong number(check every digit factorial and sum the factorials ie.sum of factorial=original number) or not
		int a=12;
		int b=a;
		int sum1=0;
		int sum=0;
		while (a!=0)
		{
			int last=a%10;
			sum=sum+last;
			a=a/10;
		}
		
		while (sum!=0)
		{
			int product=1;
			int last=sum%10;
			for (int i=1 ;i<=last ;i++ )
			{
				product=product*i;
			}
			sum1=sum1+product;
			sum=sum/10;			
		}
		System.out.println(sum1);
		if (sum1==b)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}
