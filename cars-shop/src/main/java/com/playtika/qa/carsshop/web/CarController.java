package com.playtika.qa.carsshop.web;

import com.playtika.qa.carsshop.domain.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CarController {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);
    @GetMapping("/getcar")
    public ResponseEntity getCustomer() {
        return new ResponseEntity("kot", HttpStatus.OK);
    }

    @PostMapping(value = "/addcar")
    public ResponseEntity createCustomer( @RequestBody Car car) {
        return new ResponseEntity(car, HttpStatus.OK);
    }
}
