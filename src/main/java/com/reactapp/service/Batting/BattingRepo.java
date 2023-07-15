package com.reactapp.service.Batting;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactapp.model.Batting;

@Repository
public interface BattingRepo extends CrudRepository<Batting, Integer>{
    
}
