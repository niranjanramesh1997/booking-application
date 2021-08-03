package org.superops.demo.moviebooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.superops.demo.moviebooking.model.db.Movie;
import org.superops.demo.moviebooking.repository.db.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
