package com.kabiru.alpha.rest;

import com.kabiru.alpha.feign.NetflixFeign;
import com.kabiru.alpha.models.Category;
import com.kabiru.alpha.models.Movie;
import com.kabiru.alpha.models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleRest implements CommandLineRunner {

    private final NetflixFeign netflixFeign;

    public SampleRest(NetflixFeign netflixFeign) {
        // Empty constructor
        this.netflixFeign = netflixFeign;
    }

    @Override
    public void run(String... args) throws Exception {

        // Where the program runs
        List<Category> all_categories = netflixFeign.getAllCategories();
        System.out.println(all_categories.toString());

        List<Movie> all_movies = netflixFeign.getAllMovies();
        System.out.println(all_movies.toString());
    }
}
