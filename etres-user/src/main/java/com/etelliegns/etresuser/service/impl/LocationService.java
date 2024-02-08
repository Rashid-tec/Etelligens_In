package com.etelliegns.etresuser.service.impl;



import com.etelliegns.etresuser.handler.LocationNotFoundException;
import com.etelliegns.etresuser.model.Location;

import com.etelliegns.etresuser.repo.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class LocationService {



        @Autowired
        public LocationRepo locationrepo;


          public List<Location> getByLocation(String location) {
              List<Location> locations = locationrepo.findByLocation(location);

              if (locations.isEmpty()) {
                  throw new LocationNotFoundException("Location not found with this locations: " );
              }



           return locationrepo.findByLocation(location);
            }
    public List<Location> getAllLocations() {
        return locationrepo.findAll();
    }



    public Location saveLocation(Location e)
        {
            try {
                return locationrepo.save(e);
            }
            catch (Exception exception)
            {
                throw new LocationNotFoundException("Error while adding a location"+exception);
            }



        }
    }


