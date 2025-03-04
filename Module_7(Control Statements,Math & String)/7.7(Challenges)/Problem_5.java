import java.util.*; 

public class Problem_5 {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum\n");
        int[] arr = ArrayUtility.inputArray(); // Ensure ArrayUtility is implemented correctly.

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}

// Utility class to handle array input
class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
