package oop.polymorphism;

import java.util.concurrent.atomic.AtomicBoolean;

public class NextMain {
    public static void main(String[] args) {
//        var airplane = Movie.getMovie("C", "Airplane");
//        airplane.watchMovie();

        Object unknownObject = Movie.getMovie("S", "Jaws");

        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }
        else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }
        else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }

        //var plan = Movie.getMovie("C","Airplane");
        //plan.watchMovie();
    }
}
