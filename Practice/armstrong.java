class armstrong
{
   public static void main(String args[])
   {
        int a=153,temp,r,result=0;
        temp=a;
       while(a!=0)
       {
              r=a%10;
              result+=r*r*r;
             a=a/10;  
       }
      
      if(temp==result)
      {
             System.out.println("this number is armstrong number");
       }
      else
      {
             System.out.println("this number not is armstrong number");
      }
   }
    
}
