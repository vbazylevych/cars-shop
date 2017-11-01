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
                                         @RequestBody String engine) throws JSONException {
        JSONObject json = new JSONObject(engine);
       String engineValue = json.get("engine").toString();
        Car newCar = new Car(price, contactDetails, engineValue);

        return new ResponseEntity(newCar, HttpStatus.OK);
    }
}
