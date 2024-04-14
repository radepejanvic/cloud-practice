package com.movies.movies.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sv_10_2021")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Long year;
}
