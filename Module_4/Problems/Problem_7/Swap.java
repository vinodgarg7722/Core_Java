/** 
public class Swap {
    public static void main(String[] args) {


        int num1 = 5;
        int num2 = 10; 
        
        System.out.println("value of num1 before swapping :" + num1);
        System.out.println("value of num2 before swapping :" + num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("value of num1 after Swapping :" + num1);
        System.out.println("value of num2 after Swapping :" + num2);

        
    }
}
*/    

import java.util.Scanner;

class Swap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station\n\n");
        System.out.print("Enter Value Of A :");
        int a = input.nextInt();
        System.out.print("Enter Value Of B :");
        int b = input.nextInt();

        int c = a;
        a=b;
        b=c;
        
        System.out.println("Ater Swapping");
        System.out.println("Value of A is:" + a);
        System.out.println("Value of B is:" + b);


    }
}