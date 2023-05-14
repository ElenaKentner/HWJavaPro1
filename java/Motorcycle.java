public class Motorcycle extends Car {
    public Motorcycle(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public void drive() {
        System.out.println("Driving Motorcycle " + getModel());
    }
}
