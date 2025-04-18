package StudentSystem;

public class Main {
    public static void main(String[] args) {
        Student[] Students = new Student[10];

        Undergraduate u1 = new Undergraduate("John Doe", 3.9, false);
        Students[1] = u1;

        Graduate g1 = new Graduate("Taylor Chris", 3.9, "Impact of AI in healthcare");
        Students[2] = g1;

        processStudents(Students);
    }

    public static void processStudents(Student[] students) {
        for (Student s : students) {
            if(s != null) {
                System.out.println("--------State--------\n" + s.toString());
                System.out.println("Is on probation: " + s.onProbation());

                if(s instanceof Graduate) {
                    Graduate g1 = (Graduate) s;
                    System.out.println("Thesis topic: " + g1.getThesisTopic());
                }
                if(s instanceof Undergraduate) {
                    Undergraduate u1 = (Undergraduate) s;
                    System.out.println("This student is an honor student: " + u1.getHonors());
                }
            }
        }
        System.out.println("---------------------------------------\n");
    }
}
