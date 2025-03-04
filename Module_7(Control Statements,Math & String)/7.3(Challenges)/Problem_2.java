import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker(odd/even)");
        System.out.print("Please enter your number\n");
        int num = input.nextInt();
        

        String answer  = num%2==0 ? "even":"odd";
        System.out.println(num + " is the " + answer + " number");
    }
}
