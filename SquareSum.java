class SquareSum 
{
	public static void main(String[] args) 
	{
		int num=0;
		int square = num*num;
		System.out.println(square);
		int sum=0;
		while (square!=0)
		{
			int last = square%10;
			sum =sum+last;
			square =square/10;
		}
		if (sum==num)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("No Neon Number");
		}

			
	}
}
