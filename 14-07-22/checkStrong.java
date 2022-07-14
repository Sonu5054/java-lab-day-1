import java.util.*;
import java.lang.*;
class CheckStrong
{
    public static void main (String args[])
    {  
        int n,i=1,fact=1,rem,sum=0,dummy;
		Scanner amit= new Scanner(System.in);
        System.out.print("enter number:");
		n=amit.nextInt();
		dummy=n;
		while(n!=0)
		{
			rem=n%10;
			i=1;
			fact=1;
			while(i<=rem){
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (sum==dummy)
		{
            System.out.println(dummy +"is a strong number");
        }
        else
            System.out.println(dummy +"is not a strong number");
    }
}