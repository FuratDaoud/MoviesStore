package edu.cs.moviesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import model.Movie;
import model.MovieUI;
import model.Moviefactory;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinneryear);
        populateSpinner();
    }

    private void populateSpinner() {

    }


    public void btnsearchOnclick(View view) {
        Moviefactory factory = new Moviefactory();
        MovieUI objmovies = factory.getModel();
        List<Movie> movies=objmovies.getMovies("Crime");
        String str="";
        for (Movie m:movies){
            str+=m.getTitle()+"\n";

        }
        Toast.makeText(this,str, Toast.LENGTH_SHORT).show();



    }
}