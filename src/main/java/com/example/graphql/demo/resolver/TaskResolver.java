package com.example.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demo.model.Approaches;
import com.example.graphql.demo.model.Tasks;
import com.example.graphql.demo.model.Users;
import com.example.graphql.demo.repository.ApproachesRepository;
import com.example.graphql.demo.repository.TasksRepository;
import com.example.graphql.demo.repository.UsersRepository;

import java.util.List;

public class TaskResolver implements GraphQLResolver<Tasks> {
    private TasksRepository tasksRepository;
    private UsersRepository usersRepository;
    private ApproachesRepository approachesRepository;

    public TaskResolver(TasksRepository tasksRepository, UsersRepository usersRepository, ApproachesRepository approachesRepository) {
        this.tasksRepository = tasksRepository;
        this.usersRepository =usersRepository;
        this.approachesRepository= approachesRepository;
    }

    public Users getAuthor(Tasks tasks) {
        return usersRepository.findOne(tasks.getUsers().getId());
    }

    public List<Approaches> approachList(Tasks tasks){
        return approachesRepository.findByTasks(tasks);
    }
}
