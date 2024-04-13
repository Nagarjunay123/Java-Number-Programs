class Harshad 
{
	public static void main(String[] args) 
	{
		int num=20;
		int b=num;
		int sum=0;
		while (num!=0)
		{
			int last=num%10;
			sum =sum+last;
			num =num/10;
		}
		System.out.println(b);
		if (b%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
	}
}
