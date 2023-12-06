import com.sun.source.tree.CompilationUnitTree;

import java.util.Scanner;

public class ScannerLecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String job = sc.nextLine();
        int age = sc.nextInt();
        sc.next();
        String address = sc.nextLine();

        System.out.println(name + " " + job+" " + age + " " + address);
    }






}
