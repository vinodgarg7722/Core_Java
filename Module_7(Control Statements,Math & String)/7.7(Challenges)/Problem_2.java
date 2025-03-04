
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 5;
        int guess;

        System.out.println("Welcome to the number guessing game");

        do{
            System.out.println("Please guess the number between 0 & 10 ");
            guess = input.nextInt();
        }while(num != guess);
        System.out.println("you have successfully guessed the number ");
    }
}
