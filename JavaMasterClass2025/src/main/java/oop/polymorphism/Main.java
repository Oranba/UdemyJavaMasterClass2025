package oop.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new Adventure("Star Wars");
//        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter the type of movie you want to watch (A for Adventure, C for Comedy, S for Science Fiction, Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)/*type.equalsIgnoreCase("Q")*/){
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Enter the title of the movie: ");
            String title = scanner.nextLine();
            var movie = Movie.getMovie(type, title);
            movie.watchMovie();
            System.out.println();
        }

    }
}
