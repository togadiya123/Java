import java.util.Scanner;
 
 class fact
{
    public static void main(String args[])
    {
            int a,i,fact=1;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the number : ");
            a=scan.nextInt();
           
            for(i=1;i<=a;i++)
           {
                   fact=fact*i;    
            }
          System.out.println("Factorial of no is : "+fact);
      

      }
}