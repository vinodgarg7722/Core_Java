// 1. Executes block first, then checks condition.
// 2. Guaranteed to run at least one iteration.
// 3. Unlike while, first iteration is unconditional.
// 4. Don't forget to update condition to avoid infinite loops.

import java.util.Scanner;

/**
do{
    //Body of the loop
}while (condition);
 */


public class Program {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

    //    System.out.print("Please enter your age");
    //    int age = input.nextInt();
        
    //    while (age < 0  || age > 100 ){
    //     System.out.print("Please enter your age");
    //     age = input.nextInt();
    //    }
    //    System.out.println("Your age is "+age);
     

    int age;
    do{
        System.out.println("Please enter your age:");
        age  = input.nextInt();
    }while(age < 0 || age > 100);
    System.out.println("Your age is " + age);
    
    }
}
