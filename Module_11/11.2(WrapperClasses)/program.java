// 1. Provide a way to use primitive data types (int, char, boolean, etc.) as objects.
// 2. Automatic conversion between the primitive types and their corresponding
// wrapper classes.
// 3. Once created, the value of a wrapper object cannot be changed.
// 4. Utility Methods: Each wrapper class provides useful methods, like compareTo,
// valueOf, and parseXxx (e.g., parseInt for Integer).
// 5. Required for storing primitives in collection objects like ArrayList, HashMap, etc.
// 6. Allows assignment of null to primitive values when needed


public class program {
    public static void main(String[] args) {
        // Integer first = new Integer(55); // error(depricreate in version 9 because always create new object)

        Integer first = Integer.valueOf(55);
        Integer first_1 = 55; // autoboxing
        // first.valueOf(0)

        int second_1 = first; // unboxing

        Integer second = Integer.valueOf("55");
    }
}
