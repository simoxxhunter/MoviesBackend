package com.example.MovieBackend.Controller;

import com.example.MovieBackend.dao.FavFilmInterface;
import com.example.MovieBackend.dao.FilmInterface;
import com.example.MovieBackend.dao.UsersInterface;
import com.example.MovieBackend.model.FavFilmModel;
import com.example.MovieBackend.model.FilmModel;
import com.example.MovieBackend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    private UsersInterface userDao;

    @Autowired
    private FilmInterface filmDao;

    @Autowired
    private FavFilmInterface favFilmDao;

    @GetMapping
    public List<UserModel> getAllUsers() {
        return userDao.findAll();
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return userDao.save(user);
    }

    @PostMapping("/{userId}/addFavoriteFilm/{filmId}")
    public UserModel addFavoriteFilm(@PathVariable int userId, @PathVariable int filmId) {
        Optional<UserModel> userOpt = userDao.findById(userId);
        Optional<FilmModel> filmOpt = filmDao.findById(filmId);
        if (userOpt.isPresent() && filmOpt.isPresent()) {
            UserModel user = userOpt.get();
            FilmModel film = filmOpt.get();
            FavFilmModel favFilm = new FavFilmModel();
            favFilm.setUser(user);
            favFilm.setFilms(film);
            favFilmDao.save(favFilm);
            return user;
        }
        return null;
    }

    @DeleteMapping("/{userId}/removeFavoriteFilm/{filmId}")
    public UserModel removeFavoriteFilm(@PathVariable int userId, @PathVariable int filmId) {
        Optional<UserModel> userOpt = userDao.findById(userId);
        if (userOpt.isPresent()) {
            UserModel user = userOpt.get();
            List<FavFilmModel> favoriteFilms = favFilmDao.findByUser(user);
            favoriteFilms.stream()
                    .filter(favFilm -> favFilm.getFilms().getFilm_ID() == filmId)
                    .findFirst()
                    .ifPresent(favFilmDao::delete);
            return user;
        }
        return null;
    }

    @GetMapping("/{userId}/favoriteFilms")
    public List<FavFilmModel> getFavoriteFilms(@PathVariable int userId) {
        Optional<UserModel> userOpt = userDao.findById(userId);
        return userOpt.map(favFilmDao::findByUser).orElse(null);
    }

    @GetMapping("/{userName}/{password}")
    public boolean UserR(@PathVariable String userName, @PathVariable String password) {
        return userDao.findByUserNameAndPassword(userName, password) != null;
    }


}
