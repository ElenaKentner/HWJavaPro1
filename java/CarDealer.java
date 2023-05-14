public class CarDealer {
    private Car[] inventory;

    public CarDealer(Car[] inventory) {
        this.inventory = inventory;
    }

    public void showInventory() {
        for (Car car : inventory) {
            System.out.println(car.getModel() + " Year: " + car.getYear() + ", Price: " + car.getPrice());
        }
    }

    public void testDrive(int carIndex) {
        System.out.println(inventory[carIndex].getModel() + " тестдрайв пройдет успешно!");
    }
}
