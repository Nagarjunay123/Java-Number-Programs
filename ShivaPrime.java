class ShivaPrime 
{
	public static void main(String[] args) 
	{
		int n=5;
		int lp=0;
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			int count=0;
			for (int j=1;j<=i; j++)
			{ 
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				if (i>lp)
				{
					final int flp=i;
					lp=i;
					sum=flp+lp;
				}
			}
			
		}
		System.out.println(sum);
	}
}
