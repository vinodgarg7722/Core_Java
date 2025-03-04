public class Problem_8 {
    public static void main(String[] args) {
        System.out.println("Welcome to Adding Positive Numbers");
        int[] numArr = ArrayUtility.inputArray();

        int sum = 0;

        // for(int i=0;i<numArr.length ; i++){
        //     if(numArr[i] < 0 ){
        //         continue;
        //     }
        //     sum += numArr[i];
        // }
        // System.out.println("sum of positive number is : " + sum);

        for(int num : numArr){
            if (num<0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive number is :" + sum);
    }

}
