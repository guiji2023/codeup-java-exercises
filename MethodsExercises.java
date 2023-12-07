import java.util.Scanner;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//      validateUserInput(1, 10);

//        while (true){
//            displayUserInput();
//            System.out.println("Would you like to continue? Y/N");
//            String wantContinue = sc.next();
//            if (wantContinue.equalsIgnoreCase("N")){
//                break;
//            }
//        }

    }

    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int modula (int a, int b){
        return a%b;
    }

    public static int validateUserInput (int min, int max){
        System.out.println("Enter you number between " + min +" and " + max );
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else{
            System.out.println("You are not listening!");
            return validateUserInput(min, max);
        }

    }

    public static int factorial (int a) {
        if (a == 1){
            return 1;
        } else{
            return a * factorial(a-1);
        }

    }

    public static void displayUserInput(){
        System.out.println("Enter a number between 1 and 10");
        int num = sc.nextInt();
        System.out.println("The factorial number of " + num +" is "+factorial(num));
    }


}
