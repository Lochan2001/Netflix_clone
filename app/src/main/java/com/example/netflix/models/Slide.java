package com.example.netflix.models;

public class Slide {
    private int Image;
    private String Title;
    //you can add more fields depend on your mind

    public Slide(int image, String title) {
        Image = image;
        Title = title;
    }

    public int getImage() {
        return Image;
    }

    public String getTitle() {
        return Title;
    }

    public void setImage(int image) {
        Image = image;
    }

    public void setTitle(String title) {
        Title = title;
    }
}

