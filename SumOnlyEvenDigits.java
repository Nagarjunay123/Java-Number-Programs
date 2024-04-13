import java.util.Scanner;
class SumOnlyEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num= scan.nextInt();
		int sum=0;		
		while (num!=0)
		{
			int a= num%10;
			if (a%2==0)
			{
				sum = sum+a;				
			}
			num = num/10;
		}
		System.out.println(sum);
	}
}
