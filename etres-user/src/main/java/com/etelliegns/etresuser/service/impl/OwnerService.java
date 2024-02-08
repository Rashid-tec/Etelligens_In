package com.etelliegns.etresuser.service.impl;

import com.etelliegns.etresuser.model.Owner;
import com.etelliegns.etresuser.repo.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {






        @Autowired
        private OwnerRepo ownerRepos;

        public List<Owner> getAllOwners() {
            return ownerRepos.findAll();
        }

        public Optional<Owner> getOwnerById(Long id) {

            return ownerRepos.findById(id);
        }

        public Owner saveOwner(Owner owner) {
            return ownerRepos.save(owner);
        }

        public void deleteOwner(Long id) {
            ownerRepos.deleteById(id);
        }
    }


