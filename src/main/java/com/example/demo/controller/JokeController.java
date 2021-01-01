package com.example.demo.controller;

import com.example.demo.entity.Jokes;
import com.example.demo.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class JokeController {

    JokesService jokesService;

    @Autowired
    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @GetMapping("/")
    public String getJokes(Model model){
        Jokes jokes = new Jokes();
        jokes.setJokeContent(jokesService.getJokes());
        model.addAttribute("jokeSend", jokes);
        return "jokesTemplate";
    }
    @GetMapping("/reload")
    public String reloadJokes(){

        return "redirect:/";
    }


}
