import java.util.Scanner;
class que7{
	public static void main(String args[])
	{
		int a,i,ans;
		System.out.print("enter number with which you want to multiplicate table:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(i=1;i<=10;i++)
		{
			ans=a*i;
			System.out.print(ans+",");
		}
	}
}