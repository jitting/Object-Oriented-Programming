package studentMS;

public class Undergraduate extends Student{
    private boolean isHonors;

    public Undergraduate() {
        super();
    }

    public Undergraduate(String name, double gpa, boolean isHonors) {
        super(name, gpa);
        this.isHonors = isHonors;
    }

    @Override
    public boolean onProbation() {
        return (this.getGPA() < 2.0);
    }

    @Override
    public String toString() {
        return super.toString() + 
        "Is an honor student: " + this.isHonors;
    }

    public boolean getHonors() {
        return isHonors;
    }

    public void setHonors(boolean isHonors) {
        this.isHonors = isHonors;
    }
}