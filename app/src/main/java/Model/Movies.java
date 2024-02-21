package Model;

import android.widget.ImageView;

import java.util.ArrayList;

public class Movies {
    private String title, description, rating;
    private int image;
    private ArrayList<Movies> movies_list;

    public Movies(String title, String description, String rating, int image) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
