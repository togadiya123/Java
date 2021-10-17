import java.util.Scanner;
 
 class Volume
{
  	 public int width;
 	 public int height;
 	 public int depth;
 	 public static int x;
   	 public void get(int a,int b,int c)
   	{
         		width=a;
         		height=b;
         		depth=c;
   	}

   	public int cal()
  	{
        		x=width*height*depth;
        		return x;
       
  	} 
  	public static void dis()
  	{ 
        		System.out.println("Volume is : "+x);
 	 }
    	public static void main(String args[])
   	 {
            		Volume a=new Volume();
            		a.width=10;
            		a.height=20;
            		a.depth=10;
            		int v= a.width*a.height*a.depth;
            		System.out.println("Volume is : "+v);
            		a.get(30,30,20);
            		a.cal();
            		a.dis();
            
            
    	}
}