public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
    Calls a passenger to board a given car 
    */
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    /** 
    Calls a passenger to get off a given car 
    */
    public void getOffCar(Car c) {
        c.removePassenger(this);
    }
}
