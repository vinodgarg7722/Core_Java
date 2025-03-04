
// 11.1 Variable Arguments
//  1. Java's varargs allow methods to accept any number of arguments.
//  2. Declared using an ellipsis (...), e.g., void method(int... nums).
//  3. Internal Handling: Treated as arrays, e.g., int... nums is int[] nums.
//  4. Placement: Must be the last in the method's parameters.
//  5. Usage: Call with varying argument counts, e.g., method(1, 2) or method().
//  6. Introduced in: Java 5

// public class program {
//     public static void main(String[] args) {
//         System.out.println("Hello world");

//         // System.out.println(sum(4, 5));

//         // System.out.println(sum_1(new int[]{4,5}));

//         System.out.println(sum(1,2,3,4,5,6,7));

//         // System.out.println(sum_1()); // error

//         System.out.println(sum_1(4, 5, 7,5,8,6));
//     }

//     // public static int sum(int a, int b) {
//     //     return a + b;
//     // }

//     // public static int sum_1(int[] a) {
//     //  int sum = 0;
//     //  for (int i : a) {
//     //     sum += i;
//     //  }
//     //  return sum ;
//     // }


//     public static int sum(int... a){
//         int sum = 0;
//      for (int i : a) {
//         sum += i;
//      }
//      return sum ;
//     }

//     public static int sum_1(int first,int second,int...a){
//        int sum = first+second;
//        for (int i : a) {
//         sum += i;
//        }
//        return sum;
//     }
// }



// 11.1 Variable Arguments (Varargs)
// 1. Java's varargs allow methods to accept any number of arguments.
// 2. Declared using an ellipsis (...), e.g., void method(int... nums).
// 3. Internal Handling: Treated as arrays, e.g., int... nums is int[] nums.
// 4. Placement: Must be the last in the method's parameters.
// 5. Usage: Call with varying argument counts, e.g., method(1, 2) or method().
// 6. Introduced in: Java 5

// public class program {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");

//         // Example 1: Using varargs to sum multiple integers
//         System.out.println(sum(1, 2, 3, 4, 5, 6, 7));

//         // Example 2: Using varargs with mandatory first two parameters
//         System.out.println(sum_1(4, 5, 7, 5, 8, 6));

//         // Example 3: Calling sum method with zero arguments (valid for varargs)
//         System.out.println(sum());

//         // Example 4: Calling sum_2 with Strings
//         printStrings("Java", "Python", "C++", "JavaScript");

//         // Example 5: Calling mixed parameter method (integer + varargs)
//         System.out.println(mixedSum("Total Sum:", 1, 2, 3, 4, 5));
//     }

//     // 1️⃣ Basic varargs method to sum multiple numbers
//     public static int sum(int... numbers) {
//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }
//         return sum;
//     }

//     // 2️⃣ Varargs method with at least two required parameters
//     public static int sum_1(int first, int second, int... numbers) {
//         int sum = first + second;
//         for (int num : numbers) {
//             sum += num;
//         }
//         return sum;
//     }

//     // 3️⃣ Varargs method with Strings (Demonstrates non-integer varargs)
//     public static void printStrings(String... words) {
//         System.out.println("Printing words:");
//         for (String word : words) {
//             System.out.println(word);
//         }
//     }

//     // 4️⃣ Varargs method with mixed parameters (String first, then int varargs)
//     public static String mixedSum(String message, int... numbers) {
//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }
//         return message + " " + sum;
//     }
// }


public class program {

    static void printMnay(String...elements){
        for(String element : elements){
            System.out.println(element);
        }
    }
    public static void main(String... args) {
        printMnay("one","Two","Three");
        printMnay("one","Two");
        printMnay();
        printMnay(new String[]{"one","two","three"});
    }
}