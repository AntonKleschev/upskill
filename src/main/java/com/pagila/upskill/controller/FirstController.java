package com.pagila.upskill.controller;

import com.pagila.upskill.model.Actor;
import com.pagila.upskill.model.Film;
import com.pagila.upskill.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class FirstController {
    MainService mainService;

    @GetMapping("/")
    public String firstPage() {
        return "index";
    }

    @GetMapping("/favoriteActors")
    public String favoriteActors(Model model) {
        Iterable<Film> films = mainService.showHighRate();
        model.addAttribute("films", films);
        return "favorite";
    }
}
