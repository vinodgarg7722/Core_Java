//instance variable and methods
public class Car {

    // properties / instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
   
    // Instance Methods

    public void drive(){
        System.out.println("car is driving");
        currentFuelInLiters--;      
    }

    public void addFuel(float fuel){
       currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

    public static void main(String[] args) {
        Car myCar = new Car();  // new-> object creation
        myCar.addFuel(6); 
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.currentFuelInLiters);
    }
}

