import java.util.*;
class finddigits{
public static void main(String args[])
{
	int num,digit=0,dummy;
	Scanner amit=new Scanner(System.in);
	num=amit.nextInt();
	dummy=num;
	while(num!=0)
	{
		num=num/10;
		digit++;
	}
	System.out.println("the number of digits in" +dummy+ " is " +digit);
}
}	