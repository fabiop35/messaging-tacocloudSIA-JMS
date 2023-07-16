package com.sia.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sia.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
