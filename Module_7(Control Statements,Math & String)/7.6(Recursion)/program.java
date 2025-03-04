// 1. Self-Calling Function: Recursion is when a function calls itself.
// 2. Base Case: Essential to stop recursion and prevent infinite loops.
// 3. Recursive Case: The part where the function makes a recursive call.
// 4. Stack Overflow Risk: Excessive recursion can cause stack overflow errors.
// 5. Problem Solving: Ideal for problems divisible into similar, smaller
// problems.

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Welcome to Factorial generator\n");
         System.out.print("Please enter your number :");
         int num = input.nextInt();

        //  long fact = factorialIterative(num);
        //  System.out.println("Factorial of your number is : " + fact);

         long fact_1 = factorialRecursive(num);
         System.out.println("Factorial of your number is :" + fact_1);
    }

    public static long factorialIterative(int num){
        long result = 1 ;
        for (int i = 1 ; i <= num ; i++){
          result *= i ;  
        }
        return result ;
    }

    public static long factorialRecursive(int num){
        if(num==1){
            return 1;
        }
        return num * factorialRecursive(num-1);
        
    }
}
