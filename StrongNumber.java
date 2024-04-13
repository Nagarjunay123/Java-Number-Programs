class StrongNumber 
{
	public static void Strong(int a)
	{
		int num=a;
		int sum=0;
		while (a!=0)
		{
			int last=a%10;
			int fact=1;
			for (int i=1;i<=last ;i++ )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			a=a/10;
		}
		if (sum==num)
		{
			System.out.println("Strong Number");
		}
		else 
		{
			System.out.println("Not Strong Number");
		}

	}

	public static void main(String[] args) 
	{
		Strong(145);
	}
}
