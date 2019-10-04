package com.stackroute.services;
import com.stackroute.movieRepo.MovieRepo;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class MovieServiceImpl implements MovieService {
    private MovieRepo movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepo movieRepository) {
        this.movieRepository = movieRepository;
    }
    @Override
    public Movie saveMovie(Movie movie) {
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie;
    }
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    @Override
    public Movie updateMovie(Movie movie) {
        return null;
    }
    @Override
    public boolean deleteMovie(int id) {
        if (getMovieById(id) != null) {
            movieRepository.deleteById(id);
            return true;
        }
        return false;
    }
    @Override
    public Optional<Movie> getMovieById(int id) {
        return Optional.empty();
    }
}
