package com.example.movie;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies") // MongoDB collection name
public class Movie {

    @Id
    private String id;      // MongoDB-generated ID
    private String title;   // Movie title from TMDb
    private String genre;   // Genre (can be "Unknown" or mapped from TMDb genre_ids)
    private float rating;   // TMDb rating
    private String overview;   // Movie overview
    private String posterPath; // Poster URL
    private String releaseDate; // Release date

    // No-args constructor (required by Spring Data MongoDB)
    public Movie() {}

    // Constructor with all fields except MongoDB id
    public Movie(String title, String genre, float rating, String overview, String posterPath, String releaseDate) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.overview = overview;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
    }

    // Getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public float getRating() { return rating; }
    public void setRating(float rating) { this.rating = rating; }

    public String getOverview() { return overview; }
    public void setOverview(String overview) { this.overview = overview; }

    public String getPosterPath() { return posterPath; }
    public void setPosterPath(String posterPath) { this.posterPath = posterPath; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }
}
