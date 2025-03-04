// 55. Create a program to calculate the absolute value of a given integer

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value");
        System.out.print("Please enter your number\n");
        int num = input.nextInt();

        int result = num>=0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
