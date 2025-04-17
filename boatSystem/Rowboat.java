package boatSystem;

public class Rowboat extends Boat{
    private int NumberOfOars;

    public Rowboat() {
        super();
    }

    public Rowboat(int price, double length, String color, int NumberOfOars) {
        super(price, length, color);
        this.NumberOfOars = NumberOfOars;
    }

    @Override
    public boolean isEligible() {
        return (this.getLength() >= 20);
    }

    @Override 
    public String toString() {
        return super.toString() + 
        "Number of oars: " + this.NumberOfOars;
    }

    public int getNumberOfOars() {
        return NumberOfOars;
    }

    public void setNumberOfOars(int NumberOfOars) {
        this.NumberOfOars = NumberOfOars;
    }
}
