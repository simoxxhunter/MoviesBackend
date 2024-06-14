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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String userName;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "FavFilm",
            joinColumns = @JoinColumn(name = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Set<FilmModel> favoriteFilms;

    @ManyToMany
    @JoinTable(
            name = "FavSerie",
            joinColumns = @JoinColumn(name = "idUser"),
            inverseJoinColumns = @JoinColumn(name = "idSerie")
    )
    private Set<SerieModel> favoriteSiries;
}
