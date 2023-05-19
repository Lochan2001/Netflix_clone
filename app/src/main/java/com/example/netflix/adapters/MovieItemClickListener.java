package com.example.netflix.adapters;

import android.widget.ImageView;

import com.example.netflix.models.Movie;

public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView);
}
