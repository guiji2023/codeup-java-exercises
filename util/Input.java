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
        String input = getString();
        try{
            Integer.valueOf(input);
        }catch ( NumberFormatException e){
            System.out.println("Not a number! Enter a number");
            return this.getInt(min, max);
        }
        int num = Integer.parseInt(input);
        while(num > max || num < min){
            num = scanner.nextInt();
        }
        return num;

    }
    public int getInt(){
        String input = getString();
        try{
            Integer.valueOf(input);
        }catch ( NumberFormatException e){
            System.out.println("Not a number! Enter a number");
            return this.getInt();
        }
        return Integer.parseInt(input);
    }
    public double getDouble(double min, double max){

        String input = getString();
        try{
            Double.valueOf(input);
        }catch ( NumberFormatException e){
            System.out.println("Not a number! Enter a number");
            return this.getDouble(min, max);
        }
        double num = Double.parseDouble(input);
        while(num > max || num < min){
            num = scanner.nextDouble();
        }
        return num;
    }

    public double getDouble(){
        String input = getString();
        try{
            Double.valueOf(input);
        }catch ( NumberFormatException e){
            System.out.println("Not a number! Enter a number");
            return this.getDouble();
        }
        return Double.parseDouble(input);
    }

}

class InputTest{
    public static void main(String[] args) {
        Input input = new Input();
        double myNum = input.getDouble();

    }
}
