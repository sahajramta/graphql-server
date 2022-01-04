package com.example.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.demo.model.Approaches;
import com.example.graphql.demo.model.Tasks;
import com.example.graphql.demo.model.Users;
import com.example.graphql.demo.repository.ApproachesRepository;
import com.example.graphql.demo.repository.TasksRepository;
import com.example.graphql.demo.repository.UsersRepository;

import java.util.ArrayList;
import java.util.List;

public class Query implements GraphQLQueryResolver {
    private UsersRepository usersRepository;
    private TasksRepository tasksRepository;
    private ApproachesRepository approachesRepository;

    public Query(UsersRepository usersRepository,
                 TasksRepository taskRepository,
                 ApproachesRepository approachesRepository) {
        this.usersRepository = usersRepository;
        this.tasksRepository = taskRepository;
        this.approachesRepository = approachesRepository;
    }

    public Iterable<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public Iterable<Tasks> taskMainList() {
        List taskList = new ArrayList();
        tasksRepository.findAll().forEach(task -> {
            taskList.add(task);
            System.out.println(task);
        });
        return taskList;
    }

    public List<Tasks> findAllTasks() {
        List taskList = new ArrayList();
        tasksRepository.findAll().forEach(task -> {
            taskList.add(task);
            System.out.println(task);
        });
        return taskList;
    }

    public Iterable<Approaches> findAllApproach() {
        return approachesRepository.findAll();
    }

    public long countUsers() {
        return usersRepository.count();
    }
    public long countTasks() {
        return tasksRepository.count();
    }
    public long countApproach() {
        return approachesRepository.count();
    }
}
