package model;

import java.util.List;

public interface MovieUI {
    List<Movie>getMovies(String cat);
    List<Movie> getYears(String year);
    List<Movie> getgener(String gener);

    String[] getTitles();
    String[] getgen();
    String[] getYears();

}
