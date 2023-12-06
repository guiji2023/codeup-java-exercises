import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        int i = 5;
//        while (i <=15){
//            System.out.println(i);
//            i++;
//        }
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//
//        } while(num <=100);
//        num = 100;
//        do{
//            System.out.println(num);
//            num -=5;
//        }while(num>=-10);
//
//        long num1 = 2;
//        do{
//            System.out.println(num1);
//            num1 =  num1 * num1;
//        }while(num1 <=65536);
//

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 2; i <=100; i+=2){
//            System.out.println(i);
//        }
//
//        //count backwards from 100 to -10 by every 5.
//
//        for (int i = 100; i >=-10; i-=5){
//            System.out.println(i);
//        }
//
//        for (long i = 2; i <=65536; i*=i){
//            System.out.println(i);
//        }
//
//        for (int i =0; i <= 100 ; i++){
//            printFizBuzz(i);
//        }
//
//
//        System.out.println("Enter an integer");
//        int userInput = sc.nextInt();
//        displayPowers(userInput);

        String userInput = "Y";
        while(userInput.equalsIgnoreCase("Y")){
            promptUserGrade();
            System.out.println("Enter Y/N to continue");
            userInput = sc.next();
        }
    }

    public static void printFizBuzz(int a){
        if (a%3 == 0){
            System.out.println("Fizz");
        }
        if(a%5 == 0){
            System.out.println("Buzz");
        } if(a%15 == 0){
            System.out.println("FizzBuzz");
        }

    }

    public static void displayPowers (int a){
        System.out.println("The Table of Squares of " + a + " is:");
        for(int i = 0; i <=a; i++){
            System.out.println("    "+ i + "x" + i + "=" + i*i);
        }

        System.out.println("The Table of Cubes of " + a + " is:");
        for(int i = 0; i <=a; i++){
            System.out.println("    "+ i + "x" + i + "=" + i*i*i);
        }

    }


    public static void promptUserGrade(){
        System.out.println("Enter a numeric score:");
        int score = sc.nextInt();
        String grade;
        while(score > 100 || score <0) {
            System.out.println("Invalid Score, do your job of inputting correct score\nEnter a numeric score:");
            score = sc.nextInt();
        }

        if (score > 88 && score <= 100){
            grade = "A";
        } else if(score >= 80 && score <= 88) {
            grade = "B";
        } else if(score >= 67 && score < 80){
            grade = "C";
        } else if(score >= 60 && score < 67){
            grade = "D";
        } else{
            grade = "F";
        }

        System.out.println("The score " + score + " is converted to a grade of "+grade);

    }



}
