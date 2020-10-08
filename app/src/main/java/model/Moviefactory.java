package model;

public class Moviefactory {
    public MovieUI getModel() {
        return new MovieDa();
    }
}
