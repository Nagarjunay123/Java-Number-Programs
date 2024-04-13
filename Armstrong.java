class Armstrong 
{
	public static void main(String[] args) 
	{
		int num=153;
		int a=num;
		int b=num;
		int count=0;
		int sum=0;

		while (num!=0)
		{
			count++;
			num=num/10;
		}

		while (a!=0)
		{
			int last=a%10;
			int product=1;
			int c=count;
			while (c!=0)
			{
				product=product*last;
				c--;
			}
			sum=sum+product;
			a=a/10;
		}
		if (sum==b)
		{
			System.out.println("Armstrong Number");
		}
		else 
		{
			System.out.println("Not Armstrong number");
		}
	}
}