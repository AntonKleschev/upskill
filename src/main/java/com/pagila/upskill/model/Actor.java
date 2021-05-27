package com.pagila.upskill.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "actor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Actor {

    @Id
    @Column(name = "actor_id")
    private int id;

    @Column(name = "first_name")
    private String actorName;

    @Column(name = "last_name")
    private String actorLastName;

}
