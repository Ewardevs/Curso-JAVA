package atributoStatic;

public class Classroom {
    private String studenName;
    private static String schoolName = "High School1";

    public Classroom(String studenName) {
        this.studenName = studenName;
    }

    public void showInfo(){
        IO.println("Student Name: " + studenName + ", School Name: " + schoolName);
    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Classroom.schoolName = schoolName;
    }

    
}
