package com.etelliegns.etresuser.repo;

import com.etelliegns.etresuser.model.Location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepo extends JpaRepository<Location,Long> {

    List<Location> findByLocation(String location);

}
