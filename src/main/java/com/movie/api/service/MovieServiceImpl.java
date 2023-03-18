package com.movie.api.service;

import com.movie.api.Model.Movie;
import com.movie.api.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie getMovieById(Long movieId) {
        log.debug("##### ServiceImpl *** getMovieById *** MovieID=" + movieId + " ######");
        //String url = "http://api.themoviedb.org/3/movie/785084?api_key=513ec57012d6183655f825870b006514";
        log.debug("##### ServiceImpl *** getMovieById *** MovieID=" + movieId + " ######");
        return null;
    }

    @Override
    public Movie updateMovieById(Long id, Movie movie) {
        return null;
    }
}
