import java.util.Scanner;
class que2{
	public static void main(String args[])
	{
		double r,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius : ");
		r=s.nextDouble();
		ans=(22*r*r)/7;
		System.out.println("area of circle is "+ans);
		
	}
}