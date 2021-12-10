import java.util.Scanner;
class que6{
	public static void main(String args[])
	{
		int a,fact=1,i;
		System.out.print("enter number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+ a + " is "+ fact);
	}
}