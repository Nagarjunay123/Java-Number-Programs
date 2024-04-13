class SumEvenPerfectOddprime
{
	public static void main(String[] args) 
	{
		int num=6;
		int a=0;
		int sum=0;
		int num1=num;
		for (int i=1;i<=num;i++ )
		{
			sum=sum+i;
		}
		System.out.println(sum);

		if (sum%2==0)
		{
			for (int i=1;i<sum ;i++ )
			{
				if (sum%i==0)
				{ 
					num=num+i;
				}
			}
			if (sum==num)
			{
				System.out.println("perfect Number");
			}
			else
			{
				System.out.println("Not Perfect Number");
			}
		}
			
		else 
		{
			System.out.println("Not Perfect Number");
			for (int i=1;i<=sum ;i++ )
			{
				if (sum%i==0)
				{
					a++;
				}
			}
			if (a==2)
			{
				System.out.println("prime Number");
			}
			else
			{
				System.out.println("Not prime Number");
			}
		}
			
	}
	
}
