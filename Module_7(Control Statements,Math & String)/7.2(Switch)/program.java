// 1. Multiple Cases: Handles multiple values for an expression efficiently.
// 2. Supported Types: Accepts byte, short, char, int, String,enums, and from Java 14, long, float, double.
// 3. Case Labels: Each case ends with a colon (:) and is followed by code.
// 4. Break Statement: Typically used to prevent fall-through between cases.
// 5. Default Case: Executes if no case matches; optional and doesn't require break.
// 6. Type Safety: Case label types must match the switch expression's type.

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Day of the weel detector\n");
       System.out.println("Enter your day in number");
       int day = input.nextInt();
    //    oldSwitch(day);
       newSwitch(day);

    }

    public static void oldSwitch(int day){
        switch (day) {
            case 1: // (day == 1 )
                System.out.println("Monday");
                break;
            case 2: // (day == 2 )
                System.out.println("Tuesday");
                break;    
            case 3: // (day == 3 )
                System.out.println("Wednesday");
                break;
            case 4: // (day == 4 )
                System.out.println("Thrusday");
                break;  
            case 5: // (day == 5 )
                System.out.println("Friday");
                break;   
            case 6: // (day == 6 )
                System.out.println("Saturday");
                break; 
            case 7: // (day == 7 )
                System.out.println("Sunday");
                break; 
            // case 6: //fall through
            // case 7:
            //      System.out.println("Holiday");  
            //      break;       
            default:
                System.out.println("Invalid day");
            
        }
    }

    public static void newSwitch(int day){
        String output = switch (day){
             case 1 -> "MOnday";
             case 2 -> "Tuesday";
             case 3 -> "Wednesday";
             case 4 -> "Thrusday";
             case 5 -> "Friday";
             case 6 -> "Saturday";
             case 7,8 -> "Sunday"; //fall through
             default -> "Invalid";
            };
        System.out.println(output);
    }
}


// 1. Enhanced Switch: Java 12 introduced enhancements like yield and multiple constants per case.
// 2. Switch Expression: From Java 14, switch can return a value using yield.

// String output = switch (day){
//     case 1 -> "MOnday";
//     case 2 -> "Tuesday";
//     case 3 -> "Wednesday";
//     case 4 -> "Thrusday";
//     case 5 -> "Friday";
//     case 6 -> "Saturday";
//     case 7 -> "Sunday";
//     default -> "Invalid";
// };
// System.out.println(output);