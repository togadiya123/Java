import java.util.Scanner;
class que3{
	public static void main(String args[])
	{
		System.out.println("enter any two number :");
		Scanner s=new Scanner(System.in);
		double num1=s.nextDouble();
		double num2=s.nextDouble();
		if(num1>num2)
			System.out.println(num1 +"is greater than "+num2);
		else
			System.out.println(num2 +"is greater than "+num1);
			
	}
	
}