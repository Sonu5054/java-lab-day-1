import java.util.Scanner;
class password
{
	public static void main(String args[])
	{
		String username;
		int password;
		Scanner amit=new Scanner(System.in);
		System.out.print("enter username:");
		username=amit.nextLine();
		System.out.print("Enter password:");
		password=amit.nextInt();
		System.out.println(password);
		{
		if(password==12345)
		{
			System.out.println(username+"login successfull:");
		}
		else{
			System.out.println(username+"login denied:");
			}
		}
	}
}