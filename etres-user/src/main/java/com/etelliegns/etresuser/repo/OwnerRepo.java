package com.etelliegns.etresuser.repo;

import com.etelliegns.etresuser.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner,Long> {
}
