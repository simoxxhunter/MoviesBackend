package com.example.MovieBackend.dao;

import com.example.MovieBackend.model.FavFilmModel;
import com.example.MovieBackend.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavFilmInterface extends JpaRepository<FavFilmModel, Integer> {
    List<FavFilmModel> findByUser(UserModel user);
}

