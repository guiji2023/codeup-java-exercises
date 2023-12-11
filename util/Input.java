package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    };


    public boolean yesNo(){
        return this.scanner.nextLine().equalsIgnoreCase("yes") || this.scanner.nextLine().equalsIgnoreCase("y");
    }
    public int getInt(int min, int max){
        int num = scanner.nextInt();
        while(num > max || num < min){
            num = scanner.nextInt();
        }
        return num;

    }
    public int getInt(){
        return this.scanner.nextInt();
    }
    public double getDouble(double min, double max){
        double num = scanner.nextDouble();
        while(num > max || num < min){
            num = scanner.nextDouble();
        }
        return num;
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

}

class InputTest{
    public static void main(String[] args) {
        Input input = new Input();
        double myNum = input.getDouble();
        System.out.println(myNum);
    }
}
