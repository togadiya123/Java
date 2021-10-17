class palidrom
{
   public static void main(String args[])
   {
        int a=12121,temp,sum=0,r;
        temp=a;
       while(a>0)
       {
              r=a%10;
              sum=(sum*10)+r;
             a=a/10;  
       }
      
      if(temp==sum)
      {
             System.out.println("this number is palidrom");
       }
      else
      {
             System.out.println("this number not is palidrom");
      }
   }
    
}
