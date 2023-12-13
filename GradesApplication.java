import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = getStringStudentHashMap();

//        for (String key: students.keySet()
//             ) {
//            System.out.println("----------------------------------------------------------------");
//            System.out.println("-----------Github Username: " + key);
//            System.out.println("-----------Student Name:    " + students.get(key).getName());
//            System.out.println("-----------Grade Average:   " + students.get(key).getGradeAverage());
//            System.out.println("----------------------------------------------------------------");
//        }

        displayInstructions(students);
    }

    private static HashMap<String, Student> getStringStudentHashMap() {
        ArrayList<Integer>grades1 = new ArrayList<>();
        Student student1 = new Student("Ivan", grades1);
        student1.addGrade(96);
        student1.addGrade(97);
        student1.addGrade(98);


        ArrayList<Integer>grades2 = new ArrayList<>();
        Student student2 = new Student("Ilie", grades2);
        student2.addGrade(90);
        student2.addGrade(91);
        student2.addGrade(92);



        ArrayList<Integer>grades3 = new ArrayList<>();
        Student student3 = new Student("Inbred", grades3);
        student3.addGrade(93);
        student3.addGrade(94);
        student3.addGrade(95);


        HashMap<String, Student> students = new HashMap<>();


        students.put("guiji2001", student1);
        students.put("guiji2002", student2);
        students.put("guiji2003", student3);
        return students;
    }



    public static void displayInstructions (HashMap<String, Student> students){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> usernames = new ArrayList<>();


        System.out.println("Welcome!");
        System.out.println("Here are some GitHub usernames of our students:");
        for (String key: students.keySet()
             ) {
            usernames.add(key);
            System.out.print("|" + key + "|");
        }
        System.out.println("\n");

        while (true){
            System.out.println("What student would you like to see more information on?");
            String username = sc.nextLine();
            if (usernames.contains(username)){
                System.out.println("Name: " + students.get(username).getName() + " - Github Username: " + username);
            } else{
                System.out.println("Sorry, no student found with GitHub username of \""+username+"\"");
            }
            System.out.println("Would you like to see another student?");
            String isContinue = sc.nextLine();
            if(isContinue.equalsIgnoreCase("no")){
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
        }

    }
}
