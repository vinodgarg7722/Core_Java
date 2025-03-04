// 1. Break lets you stop a loop early, or break out of a loop
// 2. Continue is used to skip one iteration or the current iteration
// 3. In while loop remember to do the increment manually before using continue


public class program {
    public static void main(String[] args) {

        // for (int i = 1 ; i<1000 ; i++){
        //     if (i == 101){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("out of loop");

        System.out.println("before loop");
        for(int i = 1 ; i <= 10;i++){
            if (i==9) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of Loop");
    }
}
