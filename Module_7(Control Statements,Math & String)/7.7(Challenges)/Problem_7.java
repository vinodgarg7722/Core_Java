import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter your command :");
            String command = input.next();
            // if (command == "exit"){
            //     break;
            // }

            // if (command.equals("exit")){
            //     break;
            // }

            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have Successfuly exited,");
    }
}
