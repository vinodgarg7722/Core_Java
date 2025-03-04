/**
 public class Car {
  int noOfWheels;
  int noOfDoors;
  int maxSpeed;

  String name;
  String modelNumber;
  String company;

  // Constructor
  public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
      this.noOfWheels = noOfWheels;
      this.noOfDoors = noOfDoors;
      this.maxSpeed = maxSpeed;
      this.name = name;
      this.modelNumber = modelNumber;
      this.company = company;
  }

  // Main method
  public static void main(String[] args) {
      // Create a Car object
      Car swift = new Car(4, 4, 200, "Swift", "SW2024", "Maruti Suzuki");

      System.out.println(swift.toString());

      // // Print details
      // System.out.println("Car Details:");
      // System.out.println("Name: " + swift.name);
      // System.out.println("Model Number: " + swift.modelNumber);
      // System.out.println("Company: " + swift.company);
      // System.out.println("Number of Wheels: " + swift.noOfWheels);
      // System.out.println("Number of Doors: " + swift.noOfDoors);
      // System.out.println("Max Speed: " + swift.maxSpeed + " km/h");
  }
}
*/

public class Car {
  // Main method
  public static void main(String[] args) {
      // Create a Car object
      Car swift = new Car(4, 4, 200, "Swift", "SW2024", "Maruti Suzuki");

      System.out.println(swift.toString());

      
  }
  int noOfWheels;
  int noOfDoors;

  int maxSpeed;
  String name;
  String modelNumber;

  String company;

  // Constructor
  public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
      this.noOfWheels = noOfWheels;
      this.noOfDoors = noOfDoors;
      this.maxSpeed = maxSpeed;
      this.name = name;
      this.modelNumber = modelNumber;
      this.company = company;
  }
  
  
  

  public String toString(){
    return "My car name is : " + name;
  }
}