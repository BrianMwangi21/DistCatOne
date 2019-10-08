package com.kabiru.alpha.feign;

import com.kabiru.alpha.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="netflixFeign", url="http://127.0.0.1:8000/", configuration = FeignConfig.class)
public interface NetflixFeign {

    // Create new user
    @RequestMapping( method = RequestMethod.POST, value = "create-user" )
    User createUser(@RequestBody User user);

    // Suggest new movie
    @RequestMapping( method = RequestMethod.POST, value = "suggest-movie" )
    Movie suggestMovie(@RequestBody Movie movie);

    // Get list of movies
    @RequestMapping( method = RequestMethod.GET, value = "all-movies" )
    List<Movie> getAllMovies();

    // Get specific movie
    @RequestMapping( method = RequestMethod.GET, value = "get-movie/{category-id}" )
    Movie getSpecificMovie(@PathVariable( name = "category-id" ) long id, @RequestParam( name = "type") String type);

    // Update specific movie
    @RequestMapping( method = RequestMethod.GET, value = "update-movie/{id}" )
    Movie updateSpecificMovie(@PathVariable( name = "id" ) long id, @RequestBody Movie movie, @RequestBody User user);

    // Update specific movie
    @RequestMapping( method = RequestMethod.GET, value = "update-movie/{id}" )
    String deleteSpecificMovie(@PathVariable( name = "id" ) long id, @RequestBody Movie movie, @RequestBody User user);
}
