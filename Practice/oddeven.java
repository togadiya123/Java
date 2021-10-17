import java.util.Scanner;
 
 class oddeven
{
    public static void main(String args[])
    {
            int a;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter  number");
            a=scan.nextInt();
      

            if(a%2==0)
            {
                      System.out.println(a +" no even number");
             }
            else
            {
                       System.out.println(a +" no odd number"); 
             }
            
    }
}