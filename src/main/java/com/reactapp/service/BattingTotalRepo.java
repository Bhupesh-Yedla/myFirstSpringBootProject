package com.reactapp.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactapp.model.BattingTotal;

@Repository
public interface BattingTotalRepo extends CrudRepository<BattingTotal,Integer>{
    
}
