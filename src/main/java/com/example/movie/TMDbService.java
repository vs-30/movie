package com.example.movie;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

@Service
public class TMDbService {

    private static final String API_KEY = "74c3ca01d1930359cc3b886d1e45a39b"; // replace with your key
    private static final String URL = "https://api.themoviedb.org/3/movie/popular?api_key=" + API_KEY;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Movie> fetchMovies() {
        Map<String, Object> response = restTemplate.getForObject(URL, Map.class);
        List<Map<String, Object>> results = (List<Map<String, Object>>) response.get("results");

        return results.stream()
                .map(m -> new Movie(
                        (String) m.get("title"),
                        "Unknown", // or map genre_ids
                        ((Number) m.get("vote_average")).floatValue(),
                        (String) m.get("overview"),
                        (String) m.get("poster_path"),
                        (String) m.get("release_date")
                ))
                .collect(Collectors.toList());
    }

}

