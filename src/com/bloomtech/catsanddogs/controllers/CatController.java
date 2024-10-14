package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// controllers are classes that contain methods that handle server requests
//
// when a server receives a request it scans all the classes in the same java package as the
// server for the controller that will handle the path in the request (ex: /cats)

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
