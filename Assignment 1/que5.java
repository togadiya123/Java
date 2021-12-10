import java.util.Scanner;
class que5{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=s.nextInt();
		System.out.println("enter value of b:");
		 
		 //swaping using third variable
		int b=s.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("after swapping : a="+ a +" and b="+ b);
         
         //swapping without third variable
		System.out.println("enter value of a:");
		int a1=s.nextInt();
		System.out.println("enter value of b:");
		int b1=s.nextInt();
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("after swapping : a="+ a1 +" and b="+ b1);
		
		
	}
}