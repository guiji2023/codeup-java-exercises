import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades ) {
        this.name = name;
        this.grades =  new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int size = this.grades.size();
        int sumScore = 0;
        for (int grade: grades
             ) { sumScore += grade;

        }
        return (double) sumScore / size;
    }
}
