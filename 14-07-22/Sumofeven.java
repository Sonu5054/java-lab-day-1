import java.util.Scanner;
public class Sumofeven{

	public static void main(String[] args)
	{
		int number,i,evenSum=0;
		Scanner amit=new Scanner(System.in);
		System.out.print("enter the number:");
		number=amit.nextInt();
		for(i=1;i<=number;i++)
		{
			if(i%2==0)
			{
				evenSum+=i;
			}
		}
		System.out.println("the sum of even number upto"+number+"="+evenSum);
	}
}