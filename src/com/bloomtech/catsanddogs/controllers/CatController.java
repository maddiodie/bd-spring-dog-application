package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController
{
    private CatRepository catRepo = new CatRepository();

    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs()
    {
        return new ResponseEntity<>(catRepo.getCats(), HttpStatus.OK);
    }
}
