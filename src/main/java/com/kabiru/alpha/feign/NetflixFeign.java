package com.kabiru.alpha.feign;

import com.kabiru.alpha.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="netflixFeign", url="http://10.51.36.220:9000/", configuration = FeignConfig.class)
public interface NetflixFeign {

    // Get all users
    @RequestMapping( method = RequestMethod.GET, value = "users" )
    List<User> getAllUsers();

    // Get specific user
    @RequestMapping( method = RequestMethod.GET, value = "users/{id}" )
    User getSpecificUser(@PathVariable( name = "id" ) long id);

    // Create new user
    @RequestMapping( method = RequestMethod.POST, value = "users" )
    User createUser(@RequestBody User user);

    // Get all categories
    @RequestMapping( method = RequestMethod.GET, value = "categories" )
    List<Category> getAllCategories();

    // Get specific category
    @RequestMapping( method = RequestMethod.GET, value = "categories/{id}" )
    Category getSpecificCategory(@PathVariable( name = "id" ) long id);

    // Create new category
    @RequestMapping( method = RequestMethod.POST, value = "categories" )
    Category createCategory(@RequestBody Category category);

    // Get list of movies
    @RequestMapping( method = RequestMethod.GET, value = "movies" )
    List<Movie> getAllMovies();

    // Get specific movie
    @RequestMapping( method = RequestMethod.GET, value = "movies/categories/{category-id}" )
    Movie getSpecificMovie(@PathVariable( name = "category-id" ) long id, @RequestParam( name = "type") String type);

    // Suggest new movie
    @RequestMapping( method = RequestMethod.POST, value = "movies/suggest" )
    Movie suggestMovie(@RequestBody Movie movie);

    // Get specific movie
    @RequestMapping( method = RequestMethod.GET, value = "movies/{id}" )
    Movie getSpecificMovie(@PathVariable( name = "id" ) long id);

    @RequestMapping( method = RequestMethod.GET, value = "movies/{id}" )
    String deleteSpecificMovie(@PathVariable( name = "id" ) long id, @RequestParam( name = "user") long user_id);
}
