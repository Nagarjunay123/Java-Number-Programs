class Spy
{
	public static void main(String[] args) 
	{
		int num=9;
		int sum=0;
		int product=1;
		while (num!=0)
		{
			int last = num%10;
			sum = sum+last;
			product = product*last;
			num = num/10;
		}
		if (sum==product)
		{
			System.out.println("SPY");
		}
		else
		{
			System.out.println("NOT SPY");
		}
	}
}
