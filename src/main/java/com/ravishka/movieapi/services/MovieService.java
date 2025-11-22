package com.ravishka.movieapi.services;

import com.ravishka.movieapi.entities.movie;
import com.ravishka.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<movie> allMovies(){
        return movieRepository.findAll();

    }
}
