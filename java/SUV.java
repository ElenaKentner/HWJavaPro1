public class SUV extends Car {
    public SUV(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public void drive() {
        System.out.println("Driving SUV " + getModel());
    }
}