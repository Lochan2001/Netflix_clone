package com.example.netflix.utils;

import com.example.netflix.R;
import com.example.netflix.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataSource {




    public static List<Movie> getPopularMovies(){
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Moana", R.drawable.moana, R.drawable.spidercover));
        lstMovies.add(new Movie("Black P", R.drawable.blackp, R.drawable.spidercover));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian, R.drawable.spaceshipcover));
        lstMovies.add(new Movie("Once Upon a time in Hollywood", R.drawable.movie4, R.drawable.spidercover));
        lstMovies.add(new Movie("BLACK WIDOW", R.drawable.movie5, R.drawable.spidercover));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian, R.drawable.spaceshipcover));

        return lstMovies;
    }


    public static List<Movie> getWeekMovies(){
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Moana", R.drawable.moana, R.drawable.spidercover));
        lstMovies.add(new Movie("Black P", R.drawable.blackp, R.drawable.spidercover));
        lstMovies.add(new Movie("The Martian", R.drawable.themartian, R.drawable.spaceshipcover));
        lstMovies.add(new Movie("Once Upon a time in Hollywood", R.drawable.movie4, R.drawable.spidercover));
        lstMovies.add(new Movie("BLACK WIDOW", R.drawable.movie5, R.drawable.spidercover));
    //    lstMovies.add(new Movie("The Martian", R.drawable.themartian, R.drawable.spaceshipcover));

        return lstMovies;
    }



}
