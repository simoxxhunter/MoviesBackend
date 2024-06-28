package com.example.MovieBackend.Controller;

import com.example.MovieBackend.model.FavFilmModel;
import com.example.MovieBackend.Services.FavFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/favoriteFilm")
public class FavFilmController {

    @Autowired
    private FavFilmService favFilmService;

    @PostMapping("/addFavFilm")
    public FavFilmModel addFavoriteFilm(@RequestBody Map<String, Integer> data) {
        int userId = data.get("UserID");
        int filmId = data.get("Film_ID");
        return favFilmService.addFavoriteFilm(userId, filmId);
    }

    @GetMapping("/user/{userId}")
    public List<FavFilmModel> getFavoriteFilmsByUser(@PathVariable int userId) {
        return favFilmService.getFavoriteFilmsByUser(userId);
    }

    @GetMapping
    public List<FavFilmModel> getAllFavoriteFilms() {
        return favFilmService.getAllFavoriteFilms();
    }

}
