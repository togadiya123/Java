import java.util.Scanner;

public class The10thOctober2021{

    public static void main(String args[]){
        System.out.print("Enter the number for ");
        Base base = new Base();
        System.out.print(base.a);
    }
}

class Base {
    public int a;
    Base(){
        System.out.print("You are in the constructor new Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
    };

}