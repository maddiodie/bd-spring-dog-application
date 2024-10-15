package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// controllers are classes that contain methods that handle server requests
//
// when a server receives a request it scans all the classes in the same java package as the
// server for controllers that will handle the path in the request
//
// REST is a protocol for communication between an application and a server
//
// a protocol is a set of rules for communication

@RestController // tells the server there are methods in this class to handle REST requests
public class CatController {
    private CatRepository catRepo = new CatRepository();
    // hold the data useb by this class ... nothing to do with servers

    // @GetMapping tells the server that the method that follows will handle HTTP GET
    // requests for the url path specified and identifies the type of data returned
    //
    // in this example, the method will handle HTTP GET requests for the url path "/cats"
    //
    // the combination of HTTP requests and method name must be unique ...
    // method names must still be unique within a class, even thought they don't matter
    // to the server
    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs() { // the name of the method doesn't matter
        System.out.println("Method in CatController class was called.");
        return new ResponseEntity<>(catRepo.getCats(), HttpStatus.OK);
    }
}
