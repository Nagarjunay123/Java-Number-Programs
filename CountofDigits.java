class CountofDigits 
{
	public static void main(String[] args) 
	{
		int num=12345678;
		int count=0;
		while (num!=0)
		{
			int a=num%10;
			count++;
			num=num/10;
		}
		System.out.println("The Count of Digit is : "+count);
	}
}
