package com.udemymorteza.myapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends Activity {
    List<MovieModel> movieList = new ArrayList<>();
    MoviesAdapter mAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_layout);


        RecyclerView recyclerView = findViewById(R.id.home_recyclerview);
        mAdapter = new MoviesAdapter(movieList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }
    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "2015");
        movieList.add(movie);
        movie = new MovieModel("Inside Out", "2015");
        movieList.add(movie);
        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "2015");
        movieList.add(movie);
        movie = new MovieModel("Shaun the Sheep", "2015");
        movieList.add(movie);
        movie = new MovieModel("The Martian", "2015");
        movieList.add(movie);
        movie = new MovieModel("Mission: Impossible Rogue Nation", "2015");
        movieList.add(movie);
        movie = new MovieModel("Up",  "2009");
        movieList.add(movie);
        movie = new MovieModel("Star Trek",  "2009");
        movieList.add(movie);
        movie = new MovieModel("The LEGO MovieModel", "2014");
        movieList.add(movie);
        movie = new MovieModel("Iron Man",  "2008");
        movieList.add(movie);
        movie = new MovieModel("Aliens", "1986");
        movieList.add(movie);
        movie = new MovieModel("Chicken Run",  "2000");
        movieList.add(movie);
        movie = new MovieModel("Back to the Future",  "1985");
        movieList.add(movie);
        movie = new MovieModel("Raiders of the Lost Ark",  "1981");
        movieList.add(movie);
        movie = new MovieModel("Goldfinger",  "1965");
        movieList.add(movie);
        movie = new MovieModel("Guardians of the Galaxy",  "2014");
        movieList.add(movie);
        mAdapter.notifyDataSetChanged();
    }
}