import java.util.Arrays;

class arraySort
{
   public static void main(String args[])
   {
       int array[] = {12,5,16,22};

       System.out.println("Array Before Sort : "+Arrays.toString(array));

       for(int i=0; i<array.length; i++)
       {
            for (int j=i; j < array.length; j++)
            {
                if (getWeight(array[i]) > getWeight(array[j]))
                {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
       }

       System.out.println("Array After Sort : "+Arrays.toString(array));
   }

   public static int getWeight(int number){
        int weight = 0;
        while (number != 0)
        {
            weight += number % 10;
            number = number / 10;
        }
        return weight;
   }
}