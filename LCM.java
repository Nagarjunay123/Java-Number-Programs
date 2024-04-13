class LCM 
{
	public static int lcm(int num1,int num2)
	{
		int gcd=1;
		for (int i=1; ;i++ )
		{
			if (i%num1==0 && i%num2==0)
			{
				//gcd=i;
				return gcd=i;
			}
		}  
	}
	public static void main(String[] args) 
	{
		System.out.println(lcm(6,8));
	}
}
