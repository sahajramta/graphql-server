package com.example.graphql.demo;

import com.example.graphql.demo.model.Approaches;
import com.example.graphql.demo.model.Tasks;
import com.example.graphql.demo.model.Users;
import com.example.graphql.demo.repository.ApproachesRepository;
import com.example.graphql.demo.repository.TasksRepository;
import com.example.graphql.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class Api {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private TasksRepository tasksRepository;

    @Autowired
    private ApproachesRepository approachesRepository;

    @GetMapping(path = "/user")
    public List<Users> getAllUsers(){
        List userList = new ArrayList();
        usersRepository.findAll().forEach(user -> {
            userList.add(user);
            System.out.println(user);
        });
        return userList;
    }

    @GetMapping(path = "/task")
    public List<Tasks> getAllTasks(){
        List taskList = new ArrayList();
        tasksRepository.findAll().forEach(task -> {
            taskList.add(task);
            System.out.println(task);
        });
        return taskList;
    }

    @GetMapping(path = "/approach")
    public List<Tasks> getAllApproaches(){
        List approachList = new ArrayList();
        approachesRepository.findAll().forEach(approaches -> {
            approachList.add(approaches);
            System.out.println(approaches);
        });
        return approachList;
    }

    @GetMapping(path = "/approachbytask")
    public List<Approaches> getAllApproachesByTask(){
        List approachList = new ArrayList();
        Tasks tasks = new Tasks();
        tasks.setId(1l);
        approachesRepository.findByTasks(tasks).forEach(approaches -> {
            approachList.add(approaches);
            System.out.println(approaches);
        });
        return approachList;
    }

}
