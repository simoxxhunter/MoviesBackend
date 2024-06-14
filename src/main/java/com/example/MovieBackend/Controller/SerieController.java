package com.example.MovieBackend.Controller;

import com.example.MovieBackend.dao.SerieInterface;
import com.example.MovieBackend.model.SerieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Series")
public class SerieController {

    @Autowired
    private SerieInterface SerieDao;

    @GetMapping
    public List<SerieModel> getAllSeries()
    {
        return SerieDao.findAll();
    }

    @PostMapping
    public SerieModel createSerie(@RequestBody SerieModel series){
        return SerieDao.save(series);
    }


}