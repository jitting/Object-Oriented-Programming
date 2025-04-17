package boatSystem;

public class Sailboat extends Boat{
    private int Sailarea;

    public Sailboat() {
        super();
    }

    public Sailboat(int price, double length, String color, int Sailarea) {
        super(price, length, color);
        this.Sailarea = Sailarea;
    }

    @Override 
    public boolean isEligible() {
        return (this.getLength() >= 30);
    }

    @Override
    public String toString() {
        return super.toString() + 
        "Sail area: " +this.Sailarea;
    }

    public int getSailarea() {
        return Sailarea;
    }

    public void setSailarea(int Sailarea) {
        this.Sailarea = Sailarea;
    }
}
