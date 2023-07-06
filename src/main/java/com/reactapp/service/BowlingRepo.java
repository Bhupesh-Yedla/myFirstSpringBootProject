package com.reactapp.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactapp.model.Bowling;

@Repository
public interface BowlingRepo extends CrudRepository<Bowling, Integer>{
    
}
