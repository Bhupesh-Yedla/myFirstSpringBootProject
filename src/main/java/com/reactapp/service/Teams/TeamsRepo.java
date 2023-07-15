package com.reactapp.service.Teams;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reactapp.model.Teams;

@Repository
public interface TeamsRepo extends CrudRepository<Teams,Integer> {
    
}
