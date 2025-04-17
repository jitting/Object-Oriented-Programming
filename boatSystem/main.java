package boatSystem;

public class main {
    public static void main(String[] args) {
        Boat[] Boatobjects = new Boat[10];
        Sailboat s1 = new Sailboat(500, 25, "RED", 20);
        Boatobjects[0] = s1;

        Rowboat r1 = new Rowboat(300, 45, "BLUE", 4);
        Boatobjects[1] = r1;

        processBoats(Boatobjects);
    }

    public static void processBoats(Boat[] boats) {
    for(Boat b : boats) {
        if(b != null) {
            System.out.println("State: " + b.toString());
            System.out.println("Eligibility: " + b.isEligible());
            if(b instanceof Rowboat) {
                Rowboat r1 = (Rowboat) b;
                System.out.println("Number of oars: " + r1.getNumberOfOars()); 
            }
            if(b instanceof Sailboat) {
                Sailboat s1 = (Sailboat) b;
                System.out.println("Sail area: " + s1.getSailarea());
            }
        }
    }
}
}
