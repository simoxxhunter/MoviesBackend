package com.example.MovieBackend.Services;

import com.example.MovieBackend.dao.FavFilmInterface;
import com.example.MovieBackend.dao.FilmInterface;
import com.example.MovieBackend.dao.UsersInterface;
import com.example.MovieBackend.model.FavFilmModel;
import com.example.MovieBackend.model.FilmModel;
import com.example.MovieBackend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavFilmService {

    @Autowired
    private FavFilmInterface favFilmDao;

    @Autowired
    private UsersInterface userDao;

    @Autowired
    private FilmInterface filmDao;

    public FavFilmModel addFavoriteFilm(int userId, int filmId) {
        Optional<UserModel> userOpt = userDao.findById(userId);
        Optional<FilmModel> filmOpt = filmDao.findById(filmId);
        if (userOpt.isPresent() && filmOpt.isPresent()) {
            UserModel user = userOpt.get();
            FilmModel film = filmOpt.get();
            FavFilmModel favFilm = new FavFilmModel();
            favFilm.setUser(user);
            favFilm.setFilms(film);
            return favFilmDao.save(favFilm);
        }
        return null;
    }

    public List<FavFilmModel> getFavoriteFilmsByUser(int userId) {
        Optional<UserModel> userOpt = userDao.findById(userId);
        UserModel user = userOpt.orElse(null);

        if (user != null) {
            return favFilmDao.findByUser(user);
        } else {
            return null;
        }    }

    public List<FavFilmModel> getAllFavoriteFilms() {
        return favFilmDao.findAll();

    }


}
