import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Integer> jimGrades = new ArrayList<>();
        Student student1 = new Student("Jim", jimGrades);
        student1.addGrade(96);
        student1.addGrade(100);
        System.out.println(student1.getGradeAverage());
    }
}
