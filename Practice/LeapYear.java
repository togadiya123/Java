import java.util.Scanner;
 
 class LeapYear
{
    public static void main(String args[])
    {
            int y;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter  a year : ");
            y=scan.nextInt();
           
          if(y%4==0)
          {
                    System.out.println(y+" year is leap year ");
          }
          else
          {
                     System.out.println(y+" year is  not leap year ");
           }
      

      }
}