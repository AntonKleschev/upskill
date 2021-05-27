package com.pagila.upskill.dao;

import com.pagila.upskill.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepo extends JpaRepository<Film, Long> {

    @Query(value = "SELECT * FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film)",
    nativeQuery = true)
    Iterable<Film> showHighRate();
}
