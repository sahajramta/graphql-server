package com.example.graphql.demo.repository;

import com.example.graphql.demo.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
}
