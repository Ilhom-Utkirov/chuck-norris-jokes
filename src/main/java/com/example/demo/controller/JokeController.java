package com.example.demo.controller;

import com.example.demo.entity.Jokes;
import com.example.demo.service.ReturnJokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class JokeController {

    ReturnJokesService returnJokesService;

    @Autowired
    public JokeController(ReturnJokesService returnJokesService) {
        this.returnJokesService = returnJokesService;
    }

    @GetMapping("/")
    public String getJokes(Model model){
        Jokes jokes = new Jokes();
        jokes.setJokeContent(returnJokesService.getJokes());
        model.addAttribute("jokeSend", jokes);
        return "jokesTemplate";
    }
    @GetMapping("/reload")
    public String reloadJokes(){

        return "redirect:/";
    }


}
