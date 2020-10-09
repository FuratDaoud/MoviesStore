package model;

import java.util.ArrayList;
import java.util.List;

class MovieDa implements MovieUI {
    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieDa() {
        movies.add(new Movie("Spenser Confidential ", 2019, "Crime"));
        movies.add(new Movie("The Gentlemen ", 2018, "Crime"));
        movies.add(new Movie("101 Dalmatians", 2015, "Crime"));
        movies.add(new Movie("The call of the Wild ", 2018, "Drama"));
        movies.add(new Movie("All the Brigh Places", 2019, "Drama"));
        movies.add(new Movie("Feast ", 2012, "Drama"));
        movies.add(new Movie("Don`t Speak ", 2019, "Horror"));
        movies.add(new Movie("The Pagemaster ", 2010, "Horror"));
        movies.add(new Movie(" I am Fear ", 2014, "Horror"));
        movies.add(new Movie("Dolittle ", 2014, "Comedy"));
        movies.add(new Movie("Come to Dady  ", 2020, "Comedy"));
        movies.add(new Movie("Sonic  ", 2020, "Comedy"));
        movies.add(new Movie("A Shaum the Sheep  ", 2010, "Comedy"));
    }

    public List<Movie> getMovies(String cat) {
        ArrayList<Movie> data = new ArrayList<>();
        for (Movie m : movies) {
            if (m.getTitle().equals(cat)) {
                data.add(m);
            }
        }
        return data;

    }


    @Override
    public String[] getTitles() {
        String[] titles = new String[]{"Spenser Confidential", "The call of the Wild", "Don`t Speak", "Dolittle", "The Gentlemen",
                "All the Brigh Places", "The Pagemaster", "A Shaum the Sheep", "Sonic", "101 Dalmatians", "Feast", "I am Fear "};
        return titles;

    }

   /* @Override
    public ArrayList<Movie> getYears(int year) {
        ArrayList<Movie> movie=new ArrayList<>();
        for (Movie m:movies){
            if(m.getYear()==year)
                movie.add(m);
        }
        return  movie;    }*/


    public String[] getYears() {
        String[] years = new String[]{"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
        return years;

    }


}
