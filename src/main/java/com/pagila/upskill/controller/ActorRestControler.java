package com.pagila.upskill.controller;

import com.pagila.upskill.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ActorRestControler {

    MainService mainService;

    @GetMapping(value = "actor")
    public Model actors(Model model) {
        model.addAttribute("actors", mainService.findAllActors());
        return model;
    }

}
