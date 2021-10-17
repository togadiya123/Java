import java.util.Scanner;
 
 class swap
{
    public static void main(String args[])
    {
            int a,b,c;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter  numbers");
            a=scan.nextInt();
            b=scan.nextInt();

           c=a;
           a=b;
           b=c;

             System.out.println("1 no is : "+a );
             System.out.println("2 no is : "+b); 
             
            
    }
}