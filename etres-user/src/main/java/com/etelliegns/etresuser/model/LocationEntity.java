package com.etelliegns.etresuser.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LocationEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String sqft;
    private Float price;

    private String mobileNo;
}
