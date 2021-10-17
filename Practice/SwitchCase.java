import java.util.Scanner;
 
 class SwitchCase
{
    public static void main(String args[])
    {
            int x,y,ch,z;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter  Your choice");
            ch=scan.nextInt();

          switch(ch)
         {
                     case 1:
                                    x=scan.nextInt();
                                    y=scan.nextInt();
                                    z=x+y;
                                    System.out.println("Addition is : "+z);
                                      break;
                   case 2:
                                    x=scan.nextInt();
                                    y=scan.nextInt();
                                    z=x-y;
                                    System.out.println("Subtraction is : "+z);
                                     break;
                 case 3:
                                    x=scan.nextInt();
                                    y=scan.nextInt();
                                    z=x*y;
                                    System.out.println("Multiplication is : "+z);
                                     break;
                case 4:
                                    x=scan.nextInt();
                                    y=scan.nextInt();
                                   z=x/y;
                                    System.out.println("Division is : "+(float)z);
                                     break;
               default:
                                 System.out.println("Wrong choice");

         }
           
         
      

      }
}