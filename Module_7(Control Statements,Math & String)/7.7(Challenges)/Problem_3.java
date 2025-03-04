import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to printing Tables\n");
        System.out.print("Please enter the Number you want to print table of :");
        int num = input.nextInt();

        for(int i = 1 ; i<=10 ; i++){
            System.out.println(num + "x" + i + " = " + (num*i));
        }
    }  
}
