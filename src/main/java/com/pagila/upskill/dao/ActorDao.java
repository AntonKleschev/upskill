package com.pagila.upskill.dao;

import com.pagila.upskill.model.Actor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ActorDao {

    public List<Actor> getAllActors() {
        return new ArrayList<>();
    }
}
