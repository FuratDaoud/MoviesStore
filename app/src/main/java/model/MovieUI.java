package model;

import java.util.List;

public interface MovieUI {
     List<Movie> getMovies (String cat);
     String[] getTitles();
      String[] getYears();
}
