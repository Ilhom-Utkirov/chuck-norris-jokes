package com.example.demo.service;

import com.example.demo.entity.Jokes;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ReturnJokesServiceImpl implements ReturnJokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ReturnJokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        //ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return   chuckNorrisQuotes.getRandomQuote(); //norris.chuck.ChuckNorrisQuotes.getRandomQuote();
    }
}
