package com.etelliegns.etresuser.controller;


import com.etelliegns.etresuser.model.Location;

import com.etelliegns.etresuser.service.impl.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    LocationService locationservice;

    @PostMapping(value = "/save")
    public ResponseEntity<Location> saveLocation(@RequestBody Location e) {


      Location locationentity=   locationservice.saveLocation(e);
       // Employee savedEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(locationentity);

    }
    @GetMapping("/search/{location}")

    public  ResponseEntity<List<Location>>searchPropertiesByLocation(@PathVariable String location)

    {
        List<Location> locations = locationservice.getByLocation(location);

          return ResponseEntity.ok(locations);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> locations = locationservice.getAllLocations();
        return ResponseEntity.ok(locations);
    }





}
