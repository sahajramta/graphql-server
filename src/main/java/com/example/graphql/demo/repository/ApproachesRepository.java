package com.example.graphql.demo.repository;

import com.example.graphql.demo.model.Approaches;
import com.example.graphql.demo.model.Tasks;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApproachesRepository extends CrudRepository<Approaches, Long> {

    public List<Approaches> findByTasks(Tasks tasks);
}
