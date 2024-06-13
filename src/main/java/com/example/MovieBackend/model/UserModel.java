package com.example.MovieBackend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String userName;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "FilmFavorit",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private Set<FilmModel> favoriteFilms;

    @ManyToMany
    @JoinTable(
            name = "SerieFavorit",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "sirie_id")
    )
    private Set<SerieModel> favoriteSiries;
}
