package com.etelliegns.etresuser.repo;

import com.etelliegns.etresuser.model.EmailDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmailRepo  extends JpaRepository<EmailDetailsEntity, Integer> {

}