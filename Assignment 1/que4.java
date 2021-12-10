import java.util.Scanner;
class que4{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any one number :");
		double num1=s.nextDouble();
		if(num1%2==0)
			System.out.println(num1 +"is even number");
		else
			System.out.println(num1 +"is odd number");
	}
}