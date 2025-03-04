import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to palindrome checker");
         System.out.print("Enter the String to be Checked");

         String str =  input.next();

         System.out.println("Your String is " 
                           + ((isPalindrome(str) ? "Palindrome" 
                                                   : "Not Palindrom")));


    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length()-1;

        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }

        String newstr =  str.substring(1, lastPos);
        return isPalindrome(newstr);
    }
}
