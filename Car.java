import java.util.ArrayList;

public class Car {

    ArrayList<Passenger> passengersOnBoard = new ArrayList<>(); // Stores the passengers currently on board
    int maxCapacity; // Maximum capacity of the car

    /** Constructor that takes in initial value for maximum capacity and initializes Array list */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /** Accessor-like method that returns the maximum capacity */
    public int getCapacity() {
        return maxCapacity;
    }

    /** Accessor-like method that returns the remaining seats */
    public int seatsRemaining() {
        return (maxCapacity - passengersOnBoard.size());
    }

    /** Adds a passenger */
    private boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) {
            passengersOnBoard.add(p);
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Removes a passenger */
    private boolean removePassenger(Passenger p) {
        if (passengersOnBoard.contains(p)){
            passengersOnBoard.remove(p);
            return true;
        }
        else{
            return false;
        }

    }

    /** Final method that prints out a list of all Passengers aboard the car */
    public void printManifest() {
        if (passengersOnBoard.size() > 0) {
            System.out.println(passengersOnBoard);
        }
        else{
            System.out.println("This car is EMPTY.");
    }

}}