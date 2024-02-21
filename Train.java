import java.util.ArrayList;

public class Train {
    
    Engine engine;
    ArrayList<Car> carAttached = new ArrayList<>();

    /** Constructor that initializes the Engine and Car and stores them */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, passengerCapacity);
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
    }

    public Engine getEngine() {
        return Engine();
    }

    public Car getCar(int i) {
        return carAttached.get(i);
    }

    public int seatsRemaining() {
        return seatsRemaining();
    }

    public void printManifest() {
        if (passengersOnBoard.size() > 0) {
            System.out.println(passengersOnBoard);
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }

}
