package com.example.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demo.model.Approaches;
import com.example.graphql.demo.model.Tasks;
import com.example.graphql.demo.model.Users;
import com.example.graphql.demo.repository.ApproachesRepository;
import com.example.graphql.demo.repository.TasksRepository;
import com.example.graphql.demo.repository.UsersRepository;

import java.util.List;

public class ApproachResolver implements GraphQLResolver<Approaches> {
    private UsersRepository usersRepository;
    private ApproachesRepository approachesRepository;

    public ApproachResolver(UsersRepository usersRepository, ApproachesRepository approachesRepository) {
        this.usersRepository =usersRepository;
        this.approachesRepository= approachesRepository;
    }

    public Users getAuthor(Approaches approaches) {
        return usersRepository.findOne(approaches.getUsers().getId());
    }

}
