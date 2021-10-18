import java.util.Scanner;
 
 class maximum
{
    public static void main(String args[])
    {
            int a,b,big;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter First Number : ");
            a=scan.nextInt();
            System.out.print("Enter Second Number : ");
            b=scan.nextInt();

            if(a>b)
            {
                      big=a;
             }
            else
            {
                      big=b;
             }
             System.out.println(big +" Number is bigger than Another Number");
    }
}