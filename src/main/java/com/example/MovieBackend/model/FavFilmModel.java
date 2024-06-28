package com.example.MovieBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FavoriteFilms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavFilmModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int FavFilmID;

    @ManyToOne
    @JoinColumn(name = "Film_ID")
    private FilmModel films;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UserModel user;
}
