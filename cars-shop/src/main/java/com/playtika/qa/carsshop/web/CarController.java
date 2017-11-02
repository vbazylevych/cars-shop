package com.playtika.qa.carsshop.web;

import com.playtika.qa.carsshop.domain.Car;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class CarController {

    private static final Logger LOG = LoggerFactory.getLogger(CarController.class);

    @GetMapping("/getcar")
    public ResponseEntity getCustomer() {
        return new ResponseEntity("kot", HttpStatus.OK);
    }

    @PostMapping(value = "/addcar")
    public ResponseEntity createCustomer(@RequestParam("price") int price,
                                         @RequestParam("contact") String contactDetails,
                                         @RequestBody Map<String, String> json) throws JSONException {
      // JSONObject json = new JSONObject(engineodel);

        Car newCar = new Car(price, contactDetails, json);

        return new ResponseEntity(newCar, HttpStatus.OK);
    }
}
