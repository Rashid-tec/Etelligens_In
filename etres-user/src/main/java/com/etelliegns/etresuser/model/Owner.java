package com.etelliegns.etresuser.model;
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

public class Owner {



        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long owner_id;
        private String name;

      @ManyToMany(cascade = CascadeType.ALL)
      @JoinTable(name = "owner_location",joinColumns =@JoinColumn(name = "owner_id"),
      inverseJoinColumns = @JoinColumn(name = "location_id")
      )



        private Set<Location> locations=new HashSet<>();





    }


