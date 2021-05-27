package com.pagila.upskill.service;

import com.pagila.upskill.dao.ActorDao;
import com.pagila.upskill.dao.ActorRepo;
import com.pagila.upskill.dao.FilmRepo;
import com.pagila.upskill.model.Actor;
import com.pagila.upskill.model.Film;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class MainService {
    ActorDao actorDao;
    ActorRepo actorRepo;
    FilmRepo filmRepo;

    @Transactional
    public List<Actor> getAllActor () {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor(1, "qweqwe", "weqweqwe"));
        actors.add(new Actor(2, "Anna", "Kl"));
        return actors;
    }

    public Iterable<Actor> findAllActors() {
        return actorRepo.findAll();
    }

    public Iterable<Film> showHighRate() {
        return filmRepo.showHighRate();
    }
}
