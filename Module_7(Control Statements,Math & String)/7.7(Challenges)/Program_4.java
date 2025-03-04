import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        System.out.println("Please enter the number:");
        int num = input.nextInt();
        System.out.println("your number is " + (isPrime(num) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num){
        for(int i = 2 ; i<num ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
}
}
