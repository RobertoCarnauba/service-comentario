package com.malutech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.malutech.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
