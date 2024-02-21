public class Engine {

    FuelType fuelType;
    double currentFuel;
    double maxFuel;

    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    public void refuel() {
        currentFuel = maxFuel;
    }

    public go() {
        if (currentFuel > 0){
            currentFuel -= 1;
            System.out.println("The remaining fuel level is ", currentFuel);
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
    

}