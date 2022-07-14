import java.util.Scanner;
public class Digit_Sum
{
	public static void main(String args[])
	{
		int m,n,sum=0;
		Scanner amit=new Scanner(System.in);
		System.out.print("Enter the number:");
		m=amit.nextInt();
		while(m>0)
		{
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("Sum of digits:"+sum);
	}
}