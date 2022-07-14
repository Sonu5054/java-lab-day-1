import java.util.*;
class factorial{

public static void main(String args[])
{
	int fact=1,num=5,i;
	Scanner amit=new Scanner(System.in);
	System.out.println("enter the no to print its factorial");
	num=amit.nextInt();
	for (i=1;i<=num;i++)
	{
		fact = fact*i;
	}
	System.out.println("factorial of" +num+ "is:"+fact);
}
}	
	