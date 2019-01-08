package homeworkWeek4.Prob2;

public class Phone implements Connectable {
    String brand;
    String model;
    int internalMemory;
    double price;
  
    public Phone() {
    }  	
    
    public Phone(String brand, String model, int internalMemory, double price) {
        this.brand = brand;
        this.model = model;
        this.internalMemory = internalMemory;
        this.price = price;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Phone");
    }
}