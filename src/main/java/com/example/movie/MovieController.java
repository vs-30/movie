package com.example.movie;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;
    private final TMDbService tmdbService;

    public MovieController(MovieRepository movieRepository, TMDbService tmdbService) {
        this.movieRepository = movieRepository;
        this.tmdbService = tmdbService;
    }

    // Fetch from TMDb, save to MongoDB, return list
    @GetMapping("/fetch-and-save")
    public List<Movie> fetchAndSaveMovies() {
        List<Movie> movies = tmdbService.fetchMovies();
        movieRepository.saveAll(movies);
        return movies;
    }

    // Get all movies from MongoDB
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
