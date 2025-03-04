public class program {
    public static void main(String[] args) {
        String[] array = new String[]{
           "Ram" , "Shyam" , "Mohan" , "Sohan" , "Sita" , "Geeta"
        };
        printArray(array);
    }

    public static void printArray(String[] array){
          
        // For loop
        //   for(int i = 0 ; i < array.length ;  i++){
        //     System.out.println(array[i]);
        //   }

        // For Each
           for(String name : array){
            System.out.println(name);
           }  
    }
}
