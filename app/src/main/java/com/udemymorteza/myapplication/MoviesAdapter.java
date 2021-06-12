package com.udemymorteza.myapplication;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amulyakhare.textdrawable.TextDrawable;

import java.util.List;
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<MovieModel> moviesList;
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView heading_title, subheading;
        ImageView profile_image,initialtxt;
        MyViewHolder(View view) {
            super(view);
            heading_title = view.findViewById(R.id.heading_title);
            profile_image = view.findViewById(R.id.profile_image);
            subheading = view.findViewById(R.id.subheading);
            initialtxt = view.findViewById(R.id.txt_initials);
        }
    }
    public MoviesAdapter(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_page_item_layout, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MovieModel movie = moviesList.get(position);
        holder.heading_title.setText(movie.getHeadingtitle());
        holder.subheading.setText(movie.getSubheadingtitle());

        TextDrawable drawable = TextDrawable.builder()
                .buildRound(String.valueOf(position+1), Color.BLUE);
        holder.initialtxt.setImageDrawable(drawable);

    }
    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
