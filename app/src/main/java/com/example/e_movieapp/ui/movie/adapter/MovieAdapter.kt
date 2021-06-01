package com.example.e_movieapp.ui.movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_movieapp.data.db.models.UserMovie
import com.example.e_movieapp.databinding.ItemMovieBinding


class MovieAdapter(
    var movies: List<UserMovie>,
    var movieItemClickListener: MovieItemClickListener
) : RecyclerView.Adapter<MovieAdapter.MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MoviesViewHolder(
        ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) = with(holder.binding) {

        val movie = movies[position]

        title.text = movie.title
        year.text = movie.year
        director.text = movie.director
        actors.text = movie.actors
        rate.text = movie.rate
        review.text = movie.review

        addFavourites.setOnClickListener {
            movieItemClickListener.onItemClick(movie)
        }

    }

    class MoviesViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root)
}