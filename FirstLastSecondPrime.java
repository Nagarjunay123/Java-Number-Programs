class FirstLastSecondPrime 
{
	public static void prime(int start,int end)
	{
		int first=0;
		int last=0;
		for (int i=start;i<=end ;i++ )
		{
			int count=0;
			for (int j=1;j<=i ;j++ )
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				first++;
			}
			if (first==2)
			{
				System.out.println(i);
				break;
			}
		}
		for (int i=end;i>=1 ;i-- )
		{
			int count=0;
			for (int j=1;j<=i ;j++ )
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				last++;
			}
			if (last==2)
			{
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		prime(1,10);
	}
}
