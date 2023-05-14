public interface Factory {
    Car createCar(String model, int year, double price);
    Motorcycle createMotorcycle(String model, int year, double price);
}
