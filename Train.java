import java.util.ArrayList;

public class Train {
    
    Engine engine;
    ArrayList<Car> carAttached = new ArrayList<>();
    FuelType fuelType;
    double fuelCapacity;
    int nCars;
    int passengerCapacity;
    

    /** Constructor that initializes the Engine and Car and stores them */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, passengerCapacity);
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;
    }

    /** Accessor to get engine */
    public Engine getEngine() {
        return engine;
    }

    /** Accessor to return the "i"th car */
    public Car getCar(int i) {
        return carAttached.get(i);
    }

    /** Accessor to return the maximum total capacity across all cars */
    public int getMaxCapacity() {
        int maxCap = 0;
        for (Car car:this.carAttached){
            maxCap = maxCap + car.getCapacity();
        }
        return maxCap;
    }

    /** Accessor to return the number of remaining open seats */
    public int seatsRemaining() {
        int seatsLeft = 0;
        for (Car car:this.carAttached){
            seatsLeft = seatsLeft + car.seatsRemaining();
        }
        return seatsRemaining();
    }

    /** Prints a roster of all passengers on board */
    public void printManifest() {
        for (Car car:this.carAttached) {car.printManifest();}
    }

}
