package movies;
import util.Input;


public class MoviesApplication {
    static Input input = new Input();

    public static int displayOptions(){
        System.out.println("What would you like to do?");
        System.out.println('\n');
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");
        return input.getInt(0, 5);
    }

    public static void displayMovie(Movie[] movies, int choice){
        switch (choice){
            case 1:
                for(Movie movie: movies){
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
                break;
            case 2:
                for(Movie movie: movies){
                    if (movie.getCategory().equalsIgnoreCase("animated")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;
            case 3:
                for(Movie movie: movies){
                    if (movie.getCategory().equalsIgnoreCase("drama")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;
            case 4:
                for(Movie movie: movies){
                    if (movie.getCategory().equalsIgnoreCase("horror")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;
            case 5:
                for(Movie movie: movies){
                    if (movie.getCategory().equalsIgnoreCase("scifi")){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
                break;

        }
    }

    public static void main(String[] args) {

        Movie[] movies = MoviesArray.findAll();
        int choice = displayOptions();
        while(choice !=0){
            displayMovie(movies, choice);
            choice = displayOptions();
        }

    }
}
