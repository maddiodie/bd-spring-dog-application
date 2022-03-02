package com.bloomtech.dogs.controllers;

import com.bloomtech.dogs.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController
{
    private DogRepository dogRepos = new DogRepository();

    @GetMapping(value = "/dogs", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs()
    {
        return new ResponseEntity<>(dogRepos.getDogs(), HttpStatus.OK);
    }
}
