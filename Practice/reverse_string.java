import java.util.Scanner;
class reverse_string
{
   public static void main(String args[])
   {
           String s;
          int i,n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter  a string");
            s=sc.nextLine();
           char str[]=s.toCharArray();
          
          n=str.length;
          System.out.println("Reverse string  :");
          for(i=n-1;i>=0;i--)
          {
                  System.out.print(str[i]);
          }
         
   }
    
}
