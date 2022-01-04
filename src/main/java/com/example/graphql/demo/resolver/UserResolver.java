package com.example.graphql.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.demo.model.Tasks;
import com.example.graphql.demo.model.Users;
import com.example.graphql.demo.repository.TasksRepository;
import com.example.graphql.demo.repository.UsersRepository;

public class UserResolver implements GraphQLResolver<Users> {
    private UsersRepository usersRepository;

    public UserResolver(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users getAuthor(Users users) {
        return usersRepository.findOne(users.getId());
    }
}
