class PerfectSpyNeone 
{
	public static boolean Perfect(int a)
	{
		int sum=0;
		System.out.println(Spy(6));
		for (int i=1;i<a ;i++ )
		{
			if (a%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==a)
		{
			//System.out.println("Perfect Number");
			return true;
		}
		else
		{
			//System.out.println("Not Perfect Number");
			return false;
		}
	}

	public static  boolean Spy(int a)
	{
		int sum=0;
		int product=1;
		while (a!=0)
		{
			int last=a%10;
			sum=sum+last;
			product=product*last;
			a=a/10;
		}
		if (sum==product)
		{
			//System.out.println("Spy Number");
			return true;
		}
		else
		{
			//System.out.println("Not Spy Number");
			return false;
		}
	}

	public static boolean Neon(int a)
	{
		int num=a;
		int sum=0;
		int square=num*num;
		while (square!=0)
		{
			int last=square%10;
			sum=sum+last;
			square=square/10;
		}
		if (sum==a)
		{
			//System.out.println("Neon Number");
			return true;
		}
		else
		{
			//System.out.println("Not Neon Number");
			return false;
		}
	}

	public static void main(String[] args) 
	{
		int a=123;
		//Perfect(a);
		System.out.println(Perfect(a));
		//Spy(a);
		/*System.out.println(Spy(a));
		//Neon(a):
		System.out.println(Neon(a));
		//Perfect(6);
		System.out.println(Perfect(6));
		//Spy(5);
		System.out.println(Spy(5));
		//Neon(9);
		System.out.println(Neon(9));*/
	}
}
