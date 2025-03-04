import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to set your Password\n");
        String password;
        do{
           System.out.println("Please enter your password : ");
           password = input.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
