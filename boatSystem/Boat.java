package boatSystem;

public abstract class Boat {
    private int price;
    private double length;
    private String color;

    public Boat() {
        super();
    }

    public Boat(int price, double length, String color) {
        super();
        this.price = price;
        this.length = length;
        this.color = color;
    }

    public abstract boolean isEligible();

    @Override
    public String toString() {
        return "Price: " + this.price + 
        "Length: " + this.length + 
        "Color: " + this.color;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }
    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
