import java.util.Scanner;
 
 class MultiTable
{
    public static void main(String args[])
    {
            int a,i,j;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter  number");
            a=scan.nextInt();
            for(i=1;i<=10;i++)
           {
                   j=a*i;
                   System.out.println(a+" * "+i+" =  "+j ); 
          }
      

      }
}