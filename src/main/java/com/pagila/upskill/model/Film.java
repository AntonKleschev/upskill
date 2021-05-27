package com.pagila.upskill.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "film")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Film {

    @Id
    @Column(name = "film_id")
    private int id;

    private String title;

    @Column(name = "rental_rate")
    private Float rate;
}
