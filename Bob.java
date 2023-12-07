import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wantToContinue = "y";
        String sentence;
        do {
            System.out.println("What would like to say to Bob");
            sentence = sc.nextLine();
            displayResponse(sentence);
            System.out.println("Would you like to continue? Enter Y/N");
            wantToContinue = sc.nextLine();
        }while(wantToContinue.equalsIgnoreCase("y"));

    }


    public static void displayResponse(String userInput){

        if (userInput.isEmpty()){
            System.out.println("Fine. Be that way");
        } else if(userInput.charAt(userInput.length()-1) == '?'){
            System.out.println("Sure.");
        } else if(userInput.charAt(userInput.length()-1) == '!'){
            System.out.println("Whoa, chill out!");
        } else{
            System.out.println("Whatever");
        }
    }
}
