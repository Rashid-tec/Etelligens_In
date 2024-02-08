package com.etelliegns.etresuser.controller;

import com.etelliegns.etresuser.model.Owner;
import com.etelliegns.etresuser.service.impl.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {

    @Autowired
    OwnerService ownerService;
    @GetMapping
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Owner> getOwnerById(@PathVariable Long id) {

        Optional<Owner> owner = ownerService.getOwnerById(id);

        return owner.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping("/save/Owner")
    public ResponseEntity<Owner> saveOwner(@RequestBody Owner owner) {
        Owner savedOwner = ownerService.saveOwner(owner);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOwner);
    }



}

