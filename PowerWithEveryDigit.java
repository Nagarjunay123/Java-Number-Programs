class PowerWithEveryDigit
{
	public static void main(String[] args) 
	{
		int num=12;
		while (num!=0)
		{
			int a=num%10;
			int p=2;
			int prod=1;
			while (p!=0)
			{
				prod *=a;
				p--;

			}
			System.out.println(prod);
			num=num/10;
		}
	}
}
