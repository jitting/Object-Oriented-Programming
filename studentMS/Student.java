package studentMS;

public abstract class Student {
    private String name;
    private double gpa;

    public Student() {
        super();
    }

    public Student(String name, double gpa) {
        super();
        this.name = name;
        this.gpa = gpa;
    }

    public abstract boolean onProbation();

    @Override
    public String toString() {
        return "Name: " + this.name +
                "\nGPA: " + this.gpa + "\n"; 
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
}