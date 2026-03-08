
public class Laptop {
    private String brand;
    private int price;
    private boolean isNew;

    public Laptop() {
        this.brand = "Default breand";
        this.price = 0;
        this.isNew = true;
    }
    
    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
        this.isNew = false;
    }
    
    public Laptop(String brand, int price, boolean isNew) {
        this.brand = brand;
        this.price = price;
        this.isNew = isNew;
    }

    public void TurnOn() {
        System.out.println("Laptop is turning on...");
    }

    public void TurnOff() {
        System.out.println("Laptop is turning off...");
    }

    public double CalculateDiscountedPrice(double discountPercentage) {
        double discountAmount = this.price * (discountPercentage / 100);
        return this.price - discountAmount;
    }
}
