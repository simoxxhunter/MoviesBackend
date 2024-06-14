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
public class FilmModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String titre;

        private String description;

        private String dateDeSortie;

        private Integer duree;

        private String genre;

        private String realisateur;

        private String acteurs;

        private Double note;

        @ManyToMany(mappedBy = "favoriteFilms")
        private Set<UserModel> users;

    }
