package com.example.MovieBackend.Controller;

import com.example.MovieBackend.dao.FilmInterface;
import com.example.MovieBackend.model.FilmModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Series")
public class SerieController {

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