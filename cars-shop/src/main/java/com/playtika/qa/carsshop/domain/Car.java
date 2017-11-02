package com.playtika.qa.carsshop.domain;

import lombok.Data;

import java.util.Map;

@Data
public class Car {
    private Map<String , String> param;
    private int price;
    private String contactDetails;


    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    public Car() {
    }

    public Car(int price, String contactDetails, Map param) {
        this.price=price;
        this.contactDetails=contactDetails;
        this.param = param;

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
