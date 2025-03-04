import java.util.Scanner;

// public class Program {
    
// }


//Arithmetic Operator
/**class Program {
    public static void main(String[] args) {
        int a = 8 ;
        int b = 5 ;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        double x = 8;
        double y = 5;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
    }
}
*/

//Order of Operations



/** 
public class Program {

    public static void main(String[] args) {
        System.out.println(8-3*3);
        System.out.println(9/3/3);
        System.out.println(9/(3/3));
        System.out.println(9/(3/3+2));
    }
}
*/    

//shorthand Operator

class Program {
    public static void main(String[] args) { 
        int a = 5;       
        Scanner input  = new Scanner(System.in);

        int x1 = input.nextInt();
        // a = a+x1;
        a += x1; 
        System.out.println(a);

        int x2 = input.nextInt();
        a = a+x2;
        System.out.println(a);

        int x3 = input.nextInt();
        a = a+x3;
        System.out.println(a);

        int x4 = input.nextInt();
        a = a+x4;
        System.out.println(a);
    }
}