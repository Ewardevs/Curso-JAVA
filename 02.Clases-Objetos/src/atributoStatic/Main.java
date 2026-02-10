package atributoStatic;

public class Main {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Alice");
        Classroom student2 = new Classroom("Bob");

        student1.showInfo();
        student2.showInfo();

        Classroom.setSchoolName("New High School");
        student1.showInfo();
        student2.showInfo();
    }
}
