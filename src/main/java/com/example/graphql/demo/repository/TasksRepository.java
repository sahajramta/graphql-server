package com.example.graphql.demo.repository;

import com.example.graphql.demo.model.Tasks;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Tasks, Long> {
}
