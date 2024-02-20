package com.example.moviesdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import Controller.MovieAdapter;
import Model.Movies;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Movies> movies_arrayList = new ArrayList<>();
    private String[] movieTitle, movieDescription, rating;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        movieAdapter = new MovieAdapter(movies_arrayList);
        recyclerView.setAdapter(movieAdapter);
        movieTitle = getResources().getStringArray(R.array.movieTitle);
        movieDescription = getResources().getStringArray(R.array.movieDescription);
        rating = getResources().getStringArray(R.array.movieRating);

        for (int i = 0; i <getResources().getStringArray(R.array.movieTitle).length; i++) {
            Movies movies = new Movies(movieTitle[i], movieDescription[i], rating[i]);
            movies_arrayList.add(movies);
            movieAdapter.notifyDataSetChanged();
        }
    }
}