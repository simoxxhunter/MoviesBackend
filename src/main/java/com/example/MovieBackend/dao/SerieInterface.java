package com.example.MovieBackend.dao;

import com.example.MovieBackend.model.FilmModel;
import com.example.MovieBackend.model.SerieModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SerieInterface  extends JpaRepository<SerieModel,Integer> {
}
