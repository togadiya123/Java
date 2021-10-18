import java.util.Scanner;
 
 class MultiTable
{
    public static void main(String args[])
    {
            int a,i,j;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter The Number : ");
            a=scan.nextInt();
            for(i=1;i<=10;i++)
           {
                   j=a*i;
                   System.out.println(a+" * "+i+" =  "+j );
          }
      

      }
}