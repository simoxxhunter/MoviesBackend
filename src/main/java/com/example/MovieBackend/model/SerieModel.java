package com.example.MovieBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "Series")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SerieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Serie_ID;
    private String titre;
    private String description;
    private String dateDebut;
    private String dateFin;
    private String acteurs;

    @ManyToMany(mappedBy = "favoriteSeries")
    private Set<UserModel> users;
}