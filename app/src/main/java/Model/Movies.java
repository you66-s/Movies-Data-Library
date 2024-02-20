package Model;

import java.util.ArrayList;

public class Movies {
    private String title, description;
    private String rating;
    private ArrayList<Movies> movies_list;

    public Movies(String title, String description, String rating) {
        this.title = title;
        this.description = description;
        this.rating = rating;
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
