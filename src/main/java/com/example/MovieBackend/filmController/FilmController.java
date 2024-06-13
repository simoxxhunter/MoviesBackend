package com.example.MovieBackend.filmController;

import com.example.MovieBackend.dao.FilmInterface;
import com.example.MovieBackend.model.FilmModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Films")
public class FilmController {

    @Autowired
    private FilmInterface FilmsDao;

    @GetMapping
    public List<FilmModel>
    getAllFilms(){
        return FilmsDao.findAll();
    }

    @PostMapping
    public FilmModel createFilm(@RequestBody FilmModel films){
        return FilmsDao.save(films);
    }

    
}