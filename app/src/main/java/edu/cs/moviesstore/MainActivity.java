package edu.cs.moviesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Movie;
import model.MovieUI;
import model.Moviefactory;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1,spinner2;
    private RadioGroup rg;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = findViewById(R.id.spinnertitle);
        spinner2 = findViewById(R.id.spinneryear);
        rg=findViewById(R.id.rgroup);


        populateSpinner();
        populateSpinner2();


    }



    private void populateSpinner() {
        Moviefactory factory = new Moviefactory();
        MovieUI objmovies = factory.getModel();
        String[] titles = objmovies.getTitles();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, titles);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

    }
        private void populateSpinner2() {
            Moviefactory factory = new Moviefactory();
            MovieUI objmovies = factory.getModel();
                String[] years = objmovies.getYears();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, years);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        }


    public void btnsearchOnclick(View view) {
        Moviefactory factory = new Moviefactory();
        MovieUI objmovies = factory.getModel();
        String item = "";
        item = spinner1.getSelectedItem().toString();

        List<Movie> movies = objmovies.getMovies(item);
        String str = "";
        for (Movie m:movies){
            str+=m.getTitle()+"\n";

        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();




    }
}