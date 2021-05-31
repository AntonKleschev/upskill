package com.pagila.upskill.controller;

import com.pagila.upskill.model.Film;
import com.pagila.upskill.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@AllArgsConstructor
public class FilmRestContoller {

    MainService mainService;

    @GetMapping("/film")
    public Model rate(Model model) {
        Iterable<Film> films = mainService.showHighRate();
        model.addAttribute("films", films);
        return model;
    }

    @GetMapping("/film/1")
    public ModelAndView firstRateFilm() {
        ModelAndView mav = new ModelAndView("film");
        Iterable<Film> films = mainService.showHighRate();
        Film firstFilm = films.iterator().next();
        mav.addObject("films", firstFilm);

        return mav;
    }
}
