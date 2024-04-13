class SumAndPrime 
{
	public static int sum(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int last=num%10;
			sum+=last;
			num/=10;
		}
		return sum;
	}
	public static void prime(int num)
	{
		int count=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not prime Number");
		}
	}
	public static void main(String[] args) 
	{
		int a=7;
		int b=sum(a);
		prime(a);
		prime(b);
	}
}
