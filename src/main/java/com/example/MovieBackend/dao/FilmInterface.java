package com.example.MovieBackend.dao;

import com.example.MovieBackend.model.FilmModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmInterface  extends JpaRepository<FilmModel,Integer> {
}
