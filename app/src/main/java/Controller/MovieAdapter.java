package Controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviesdata.R;

import java.util.ArrayList;

import Model.Movies;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private ArrayList<Movies> movies_list;
    private TextView rating, title, description;
    private int movie_Image;

    public MovieAdapter(ArrayList<Movies> movies_list) {
        this.movies_list = movies_list;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.film_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        Movies movies = movies_list.get(position);
        holder.title.setText(movies.getTitle());
        holder.description.setText(movies.getDescription());
        holder.rating.setText(movies.getRating());
        holder.movie_Image.setImageResource(movies.getImage());
    }

    @Override
    public int getItemCount() {
        return this.movies_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView rating, title, description;
        private ImageView movie_Image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.Film_Title);
            description = itemView.findViewById(R.id.Film_Description);
            rating = itemView.findViewById(R.id.Film_Rating);
            movie_Image = itemView.findViewById(R.id.movie_Image);
        }
    }
}
