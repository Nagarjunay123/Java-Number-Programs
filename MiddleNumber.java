class MiddleNumber
{
	public static void main(String[] args) 
	{
		int num=12345;
		int num1=num;
		int c=0;
		while (num!=0)
		{
			c++;
			num=num/10;
		}
		int a=c/2;
		while (a!=0)
		{
			num1=num1/10;
			a--;

		}
		System.out.println(num1%10);
	}
}
