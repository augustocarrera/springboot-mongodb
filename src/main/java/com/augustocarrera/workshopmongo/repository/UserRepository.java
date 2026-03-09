package com.augustocarrera.workshopmongo.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.augustocarrera.workshopmongo.domain.User;


@Repository
public interface UserRepository extends MongoRepository<User, UUID>{

}
