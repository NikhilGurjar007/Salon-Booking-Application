package com.nikhil.salonbooking.controller;
// In this Code , the class "BarberController" is part of the "com.nikhil.salonbooking.controller" package. 
// It means that the file containing this class should be located in a directory structure reflecting 
// this package hierarchy.


import com.nikhil.salonbooking.domain.BarberDetails;
// import com.nikhil.salonbooking.domain.BarberDetails -> Imports the "BarberDetails" class from the 
// specified package, indicating that this class is used in the current class.

import com.nikhil.salonbooking.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/barber")
public class BarberController {

    @Autowired
    BarberService barberService;

    @PostMapping("/register")
    public ResponseEntity createBarberRecord(@RequestBody BarberDetails barberDetails) {
        try {
            return new ResponseEntity<>(barberService.registerBarberDetails(barberDetails), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/details")
    public ResponseEntity getBarberAllRecords() {
        try {
            return new ResponseEntity<>(barberService.getBarberAllRecords(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/details/{id}")
    public ResponseEntity getBarberRecord(@PathVariable long id) {
        try {
            return new ResponseEntity<>(barberService.getBarberRecord(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
