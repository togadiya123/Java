import java.util.Scanner;
class que8{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter one year :");
		int yr=s.nextInt();
		if(yr%4==0)
			System.out.println(yr +" is leap year");
		else
			System.out.println(yr +" is not leap year");
	}
}