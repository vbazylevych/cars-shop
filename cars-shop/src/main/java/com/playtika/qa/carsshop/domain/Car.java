package com.playtika.qa.carsshop.domain;

import lombok.Data;

@Data
public class Car {
    private String engine;
    private int price;
    private String contactDetails;

    public Car() {
    }

    public Car(int price, String contactDetails, String engine) {
        this.price=price;
        this.contactDetails=contactDetails;
        this.engine=engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
