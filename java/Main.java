/*
1) Создать абстрактный класс(контракт) для автосалона. Придумать общие свойства для автомобилей
    2) Реализовать несколько конкретных классов автомобилей.
    3) Сделать класс для управления автосалоном
    4) Добавить в систему интерфейс. Вынести в него контракт для создания автомобилей и мотоциклов
 */

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("Toyota", 2020, 25000);
        Car suv = new SUV("Ford", 2021, 45000);
        Car sportsCar = new SportsCar("Porsche", 2022, 100000);

        Car[] inventory = {sedan, suv, sportsCar};
        CarDealer carDealer = new CarDealer(inventory);
        carDealer.showInventory();
        carDealer.testDrive(0);

        Factory factory = new Factory() {
            @Override
            public Car createCar(String model, int year, double price) {
                return new Sedan(model, year, price);
            }

            @Override
            public Motorcycle createMotorcycle(String model, int year, double price) {
                return new Motorcycle(model, year, price);
            }
        };

        Car newCar = factory.createCar("Honda", 2021, 20000);
        System.out.println("Автомобиль добавлен: " + newCar.getModel());
        sedan.drive();
    }
}
