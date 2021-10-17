import java.util.Scanner;
 
 class reverse
{
    public static void main(String args[])
    {
            int a,i,r,no=0;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter  number");
            a=scan.nextInt();
           
           while(a!=0)
          {
              r=a%10;
              no=(no*10)+r;
             a=a/10;
          }
          System.out.println("Reverse of no is : "+no);
      

      }
}