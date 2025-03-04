// Create a program to find the minimum of two numbers

import java.util.Scanner;

//Method_1
// public class problem_1 {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Welcome to number checker");
//         System.out.print("Please enter your first number\n");
//         int num1 = input.nextInt();
//         System.out.print("Now enter the second number:");
//         int num2 = input.nextInt();

//         int smallerNumber = num1<num2 ? num1:num2;
//         System.out.println(smallerNumber + " is the minimum number");
//     }
// }

//Method_2
class MinimumTernary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Please enter your first number\n");
        int num1 = input.nextInt();
        System.out.print("Now enter the second number:");
        int num2 = input.nextInt();

        // int min = min(num1,num2);// error because we are in static context therefore it can't allow to call directly
        // Therefore we have to create object of this class

        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum number is : " + min);
    }

    public int min(int num1, int num2){

        // Method_1

        // if (num1<num2) {
        //     return num1;
        // }
        // else{
        //     return num2;
        // }

        //Method_2
        return num1 < num2 ? num1 : num2;

    }
}