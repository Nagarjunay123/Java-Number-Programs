class productWhile 
{
	public static void main(String[] args) 
	{
		///////// product of a given number
		int num=96;
		int product=1;
		while (num!=0)
		{
			int a= num%10;
			product =product*a;
			num =num/10;
			
		}
		System.out.println(product);
	}
}
