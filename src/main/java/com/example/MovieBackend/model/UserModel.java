package com.example.MovieBackend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "Users")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
    private String userName;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "FavoriteFilms",
            joinColumns = @JoinColumn(name = "UserID"),
            inverseJoinColumns = @JoinColumn(name = "Film_ID")
    )
    private Set<FilmModel> favoriteFilms;

    @ManyToMany
    @JoinTable(
            name = "FavoriteSeries",
            joinColumns = @JoinColumn(name = "UserID"),
            inverseJoinColumns = @JoinColumn(name = "Serie_ID")
    )
    private Set<SerieModel> favoriteSeries;
}
