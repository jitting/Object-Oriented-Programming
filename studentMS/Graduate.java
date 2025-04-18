package studentMS;

public class Graduate extends Student{
    private String thesisTopic;

    public Graduate() {
        super();
    }

    public Graduate(String name, double gpa, String thesisTopic) {
        super(name, gpa);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public boolean onProbation() {
        return (this.getGPA() < 3.0);
    }

    @Override
    public String toString() {
        return super.toString() + 
        "Thesis Topic: " + this.thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }
    

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }   
}