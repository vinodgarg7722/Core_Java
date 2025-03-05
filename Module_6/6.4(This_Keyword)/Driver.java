public class Driver {

        public static void main(String[] args) {

                // Car myCar = new Car();
                // myCar.addFuel(6);
                // myCar.drive();
                // myCar.drive();
                // myCar.drive();
                // myCar.addFuel(6);
                // myCar.drive();
                // System.out.println(myCar.currentFuelInLiters);

                // Car swift = new Car();
                // swift.addFuel(6);
                // swift.start();
                // swift.drive();

                // for this keyword

                Car swift = new Car(); // Step 1: Creating Car object named 'swift'
                swift.addFuel(6); // Step 2: Adding 6 liters of fuel
                Car startedCar = swift.start(); // Step 3: Starting the car, returns 'this' (which is the same 'swift'  object)
                startedCar.drive(); // Step 4: Calling drive() on the returned object

        }
}

// public class Driver {

// static int minAgeForDriving =18;

// String name;
// String dateOfLicence;
// int age;

// public boolean isAllowedToDrive(){
// return this.age>=minAgeForDriving;
// }

// public static void main(String[] args) {

// // Car myCar = new Car();
// // myCar.addFuel(6);
// // myCar.drive();
// // myCar.drive();
// // myCar.drive();
// // myCar.addFuel(6);
// // myCar.drive();
// // System.out.println(myCar.currentFuelInLiters);

// Car swift = new Car();
// swift.addFuel(6);

// // Car startedCar = swift.start(); //car is started...bruhhhh
// // startedCar.drive(); // car is driving

// swift.start().drive(); // for method chaining
// /*
// * car is started...bruhhhh
// * car is driving
// *
// */

// Driver myDriver = new Driver();
// // myDriver.

// // driver.

// // dateOfLicenc e

// System.out.println(minAgeForDriving);

// }
// }