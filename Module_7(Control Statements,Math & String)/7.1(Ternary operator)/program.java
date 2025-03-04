// 1. Syntax: condition ? expression1 : expression2
// 2. Condition: Boolean expression, evaluates to true or false.
// 3. Expressions: Both expressions must return compatible types.
// 4. Use Case: Suitable for simple conditional assignments.
// 5. Readability: Good for simple conditions, but can reduce clarity if overused.

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Please enter your first number\n");
        int num1 = input.nextInt();
        System.out.print("Now enter the second number:");
        int num2 = input.nextInt();

        //Method_1
        // if(num1>num2){
        //     System.out.println(num1+"is the greatest number");
        // }else{
        //     System.out.println(num2+"is the greatest number");
        // }

        //Method_2
        // int greaterNumber;
        // if(num1>num2){
        //     greaterNumber=num1;
        // }else{
        //     greaterNumber=num2;
        // }
        // System.out.println(greaterNumber+"is the greatest number");

        //Method_3
        int greaterNumber_1 = num1>num2 ? num1 : num2;
        System.out.println(greaterNumber_1+"is the greatest number");
        





        }
    }
