import java.util.ArrayList;

public class Car {

    private ArrayList<Passenger> passengersOnBoard = new ArrayList<>(); // Stores the passengers currently on board
    private int maxCapacity; // Maximum capacity of the car

    /**
     * Constructor that takes in initial value for maximum capacity and initializes Array list
     * @param maxCapacity
     */
    public Car(int maxCapacity) {
        this.passengersOnBoard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * Accessor-like method that returns the maximum capacity
     * @return number of capacity
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Accessor-like method that returns the remaining seats
     * @return number of seats remaining
     */
    public int seatsRemaining() {
        return (maxCapacity - passengersOnBoard.size());
    }

    /**
     * Adds a passenger
     * @param p
     * @return true or false to adding passenger
     */
    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0) && (!passengersOnBoard.contains(p)) {
            passengersOnBoard.add(p);
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Removes a passenger
     * @param p
     * @return passenger on board true/false
     */
    public boolean removePassenger(Passenger p) {
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
        if (seatsRemaining() == maxCapacity) {
            System.out.println("This car is EMPTY");
        }
        else{
            for (int i = 0; i < passengersOnBoard.size(); i += 3){
                System.out.println(passengersOnBoard.get(i), passengersOnBoard.get(i+1), passengersOnBoard.get(i+2));
            }
        }
    }
}