package oop.polymorphism;

public class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Watching a movie: " + title + ", This is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens!"
        );
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure movie!");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny Happens!",
                "Something even funnier happens",
                "Heppy Ending!"
        );
    }

    public void watchComedy() {
        System.out.println("Watching an Comedy movie specifically!");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad aliens do bad stuff",
                "Space guys chase Aliens",
                "Planet Blows up"
        );
    }

    public void watchScienceFiction() {
        System.out.println("Watching an ScienceFiction Thriller!");
    }
}
