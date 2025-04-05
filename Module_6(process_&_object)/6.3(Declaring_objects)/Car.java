// int a = 5; 
// Here, 'a' is a primitive variable that stores the value 5.

// Car myCar;  
// Here, 'myCar' is a reference variable of type Car, but it is not pointing to any object yet.

// myCar = new Car();  
// With 'new', we created an object of the Car class, and its memory address is stored in 'myCar'.

// Car myCar = new Car();  
// This is a combination of declaration and object creation in one step. 

// Breakdown:
// - 'Car myCar;' → Created a reference variable 'myCar' of type Car.
// - 'new Car();' → Created a new object of Car class in heap memory.
// - '=' → Assigned the memory address of the newly created object to 'myCar'.


// 1. Object Creation: new instantiates a new object of a class.
// 2. Memory Allocation: Allocates memory for the object in the heap.
// 3. Constructor Invocation: Calls the class constructor to initialize the object.
// 4. Reference Return: Returns a reference to the created object.
// 5. Array Creation: Also used for creating arrays, like int[] arr = new int[5];.
// 6. Dynamic Allocation: Unlike static allocation, new allows for dynamic 
// memory allocation, allocating memory at runtime.


// MyClass objRefVar = new MyClass();

// Breakdown:

// MyClass objRefVar;  -> Declaration (Creating a reference variable of MyClass type)
// new MyClass();      -> Instantiation (Allocating memory for a new object)
// MyClass()          -> Initialization (Calling the constructor to initialize object properties)

// objRefVar is a reference variable of MyClass type.
// 'new' is a Java keyword used to create an object in heap memory.

// Important Clarifications:
// Declaration: Reference variable ka creation hota hai, lekin object memory mai nahi banta.
// Instantiation: new keyword se object memory mai create hota hai.
// Initialization: Constructor call hota hai jo object ko initialize karta hai.

/*
 * class MyClass {
    int x;
    
    MyClass() {  // Constructor
        x = 10;
        System.out.println("Object Created! x = " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass objRefVar = new MyClass();
        // Output: Object Created! x = 10
    }
}


Declaration: MyClass objRefVar;
Instantiation: new MyClass();
Initialization: MyClass() constructor run hoke x = 10 set kar raha hai

 */

//  Using Objects
// Access properties using . Operator like product.price


// Class is a blueprint , Objects are real values



//instance variable and methods
public class Car {

    // properties / instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public void drive(){
        if (currentFuelInLiters == 0 ){
            System.out.println("Car is out of fuel");
        }else if (currentFuelInLiters < 5){
        System.out.println("Car is in reserved mode , please refuel");
        currentFuelInLiters--;
        }else{
        System.out.println("car is driving");
        currentFuelInLiters--;
        }
        
    }

    public void addFuel(float fuel){
       currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}

 
