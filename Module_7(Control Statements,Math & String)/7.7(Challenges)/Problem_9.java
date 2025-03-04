public class Problem_9 {
    public static void main(String[] args) {
        // int [] numArr = ArrayUtility.inputArray();
        // System.out.println();
        // System.out.println("even numbers are : ");
        // for(int num:numArr){
        //     if (num%2 != 0) {
        //         continue;
        //     }
        //     System.out.println(num);
        // }

        for(int i = 1; i<=100 ; i++){
            if (i%2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
