package com.reactapp.service.InningsData;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactapp.model.InningsData;

@Repository
public interface InningsDataRepo extends CrudRepository<InningsData,Integer> {
    
}
