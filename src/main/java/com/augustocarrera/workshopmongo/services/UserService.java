package com.augustocarrera.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.augustocarrera.workshopmongo.domain.User;
import com.augustocarrera.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id).orElseThrow(() -> new com.augustocarrera.workshopmongo.exception.ObjectNotFoundException("User not found"));
    }
}
