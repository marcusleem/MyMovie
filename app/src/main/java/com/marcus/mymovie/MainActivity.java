package com.marcus.mymovie;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovies);
        alMovieList = new ArrayList<>();
        Movie movie1 = new Movie("The Avengers", "2012", "pg13", "Action | Sci Fi", "15/11/2014", "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        alMovieList.add(movie1);
        caMovie =new CustomAdapter(this, R.layout.row, lvMovie);
        lvMovie.setAdapter(caMovie);
    }
}
