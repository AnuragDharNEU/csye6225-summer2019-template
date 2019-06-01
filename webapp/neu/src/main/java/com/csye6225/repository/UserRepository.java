package com.csye6225.repository;

import org.springframework.data.repository.CrudRepository;


import com.csye6225.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByEmailAddress(String emaidAddress);
}
