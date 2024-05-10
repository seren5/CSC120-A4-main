public class Engine {

    /** Attributes */
    private FuelType fuelType;
    private double currentFuel;
    private double maxFuel;

    /**
     * Constructor that takes in initial values and sets them appropriately
     * @param fuelType
     * @param currentFuel
     * @param maxFuel
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    /**
     * Refuel method to reset current fuel level to maximum
     */
    public void refuel() {
        currentFuel = maxFuel;
    }

    /**
     *  Go method that decreases the fuel level, prints remaining fuel level, and returns true or false
    */
    public boolean go() {
        if (currentFuel > 0){
            currentFuel -= 1;
            System.out.println("The remaining fuel level is " + currentFuel);
            return true;
        }
        else{
            return false;
        }
    }

    /** Starting point for testing */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    

}