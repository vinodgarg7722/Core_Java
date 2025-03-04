

public class Car {

    // properties / instance variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


    public Car start(){
        if (currentFuelInLiters == 0 ){
            System.out.println("Car is out of fuel ,can not start");
        }else if (currentFuelInLiters < 5){
        System.out.println("Car is in reserved mode , please refuel");
        currentFuelInLiters--;
        }else{
        System.out.println("car is started...bruhhhh");
        currentFuelInLiters--;
        }
        return this;
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("car is driving");
        
        
    }

    public void addFuel(float currentFuelInLiters){
       this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}

