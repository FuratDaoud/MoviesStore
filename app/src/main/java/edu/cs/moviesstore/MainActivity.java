package edu.cs.moviesstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
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
    private Spinner spinner1, spinner2;
    private RadioGroup rg;
    private EditText editText;
    private TextView textView;
    private RadioButton radioButton;
    private EditText edtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = findViewById(R.id.spinnertitle);
        spinner2 = findViewById(R.id.spinneryear);
        rg = findViewById(R.id.rgroup);
        textView = findViewById(R.id.etext);
        radioButton = findViewById(R.id.rbtn1);
        radioButton = findViewById(R.id.rbtn2);
        radioButton = findViewById(R.id.rbtn3);
        radioButton = findViewById(R.id.rbtn4);
        edtext = findViewById(R.id.etext);

        populateSpinner();
        populateSpinner2();
    }

    private void populateSpinner() {
        Moviefactory factory = new Moviefactory();
        MovieUI objmovies = factory.getModel();
        String[] titles = objmovies.getTitles();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, titles);
        spinner1.setAdapter(adapter);
    }

    private void populateSpinner2() {
        Moviefactory factory = new Moviefactory();
        MovieUI objmovies = factory.getModel();
        String[] years = objmovies.getYears();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, years);
        spinner2.setAdapter(adapter);
    }

    public void btnsearchOnclick(View view) {
        Moviefactory factory = new Moviefactory();
        MovieUI objmovie = factory.getModel();
        String item2 = "";
        item2 = spinner2.getSelectedItem().toString();
        List<Movie> movie = objmovie.getYears(item2);


        for (Movie m : movie) {
            item2 += " , " + m.getTitle();
        }
        edtext.setText(item2);
    }

    public void btnsearchOnclick1(View view) {
        String value = "";
        Moviefactory factory = new Moviefactory();
        MovieUI objmovie = factory.getModel();
        value = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        List<Movie> movi = objmovie.getgener(value);


        for (Movie m : movi) {
            //item += m.getTitle();
            value += " , " + m.getTitle();

        }
        edtext.setText(value);
    }

    public void btnsearchOnclick2(View view) {
        String item = "";
        Moviefactory factory = new Moviefactory();
        MovieUI objmovie = factory.getModel();
        item = spinner1.getSelectedItem().toString();
        List<Movie> movies = objmovie.getMovies(item);

        for (Movie m : movies) {
            item += " , " + m.getYear() + " ," + m.getGenre();
        }
        edtext.setText(item);


    }
}





