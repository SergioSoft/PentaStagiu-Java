package homeworkWeek4.Prob2;

public class SmartRefrigerator implements Connectable {
    String brand;
    int numberOfDoors;
    double price;

    public SmartRefrigerator() {
    }

    public SmartRefrigerator(String brand, int numberOfDoors, double price) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
        this.price = price;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Smart-Refrigerator");
    }
}
