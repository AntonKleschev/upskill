package com.pagila.upskill.controller;

import com.pagila.upskill.dao.ActorRepo;
import com.pagila.upskill.model.Actor;
import com.pagila.upskill.model.Film;
import com.pagila.upskill.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class FirstController {
    MainService mainService;

    @GetMapping("/getAll")
    public String getAll(Model model) {
        Iterable<Actor> actors = mainService.findAllActors();
        model.addAttribute("actors", actors);
        return "main";
    }

    @GetMapping("rate")
    public String rate(Model model) {
        Iterable<Film> films = mainService.showHighRate();
        model.addAttribute("films", films);
        return "film";
    }
}
