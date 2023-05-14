public class Sedan extends Car {
    public Sedan(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public void drive() {
        System.out.println("Driving Sedan " + getModel());
    }
}


