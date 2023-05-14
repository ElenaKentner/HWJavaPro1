public class SportsCar extends Car {
    public SportsCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public void drive() {
        System.out.println("Driving Sports Car " + getModel());
    }
}