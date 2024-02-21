import java.util.ArrayList;

public class Car {

    ArrayList<String> passengersOnBoard = new ArrayList<>(); // Stores the passengers currently on board
    int maxCapacity; // Maximum capacity of the car

    /** Constructor that takes in initial value for maximum capacity and initializes Array list */
    public Car() {
        this.maxCapacity = maxCapacity;
    }

    /** Accessor-like method that returns the maximum capacity */
    public int getCapacity() {
        return maxCapacity;
    }

    /** Accessor-like method that returns the remaining seats */
    public int seatsRemaining() {
        return (maxCapacity - passengersOnBoard.length);
    }

    /** Adds a passenger */
    private addPassenger(Passenger p) {
        if (seatsRemaining > 0) {

        }
    }
    
    /** Removes a passenger */
    private removePassenger(Passenger p) {
        if ((Passenger p) in Car) {

        }
    }

    /** Final method that prints out a list of all Passengers aboard the car */
    public printManifest() {
        if (/** number of passengers on car */ > 0) {
            for (int i=0; i < /** number of elements in array */; i++){
                System.out.println(passengersOnBoard.get(i));
        }
    }   else{
            System.out.println("This car is EMPTY.");
    }

}