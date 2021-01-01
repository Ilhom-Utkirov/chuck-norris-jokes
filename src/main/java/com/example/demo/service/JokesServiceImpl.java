package com.example.demo.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJokes() {
        //ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return   chuckNorrisQuotes.getRandomQuote(); //norris.chuck.ChuckNorrisQuotes.getRandomQuote();
    }
}
