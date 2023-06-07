package com.reactapp.service;

import com.reactapp.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends CrudRepository<Login, Integer> {
    Login findByUsername(String username);
}
