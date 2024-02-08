package com.etelliegns.etresuser.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Location {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long location_id;
    private String location;
    private String soft;
    private Float price;
    private String mobileNo;
    private String address;

    @ManyToMany(mappedBy = "locations",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore

    private Set<Owner> owners =new HashSet<>();


}
