package com.example.graphql.demo;

import com.example.graphql.demo.repository.ApproachesRepository;
import com.example.graphql.demo.repository.TasksRepository;
import com.example.graphql.demo.repository.UsersRepository;
import com.example.graphql.demo.resolver.ApproachResolver;
import com.example.graphql.demo.resolver.Query;
import com.example.graphql.demo.resolver.TaskResolver;
import com.example.graphql.demo.resolver.UserResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ApproachResolver approachResolver(UsersRepository usersRepository, ApproachesRepository approachesRepository){
		return new ApproachResolver(usersRepository, approachesRepository);
	}

	@Bean
	public TaskResolver taskResolver(TasksRepository tasksRepository, UsersRepository usersRepository, ApproachesRepository approachesRepository){
		return new TaskResolver(tasksRepository, usersRepository, approachesRepository);
	}

	@Bean
	public UserResolver userResolver(UsersRepository usersRepository) {
		return new UserResolver(usersRepository);
	}

	@Bean
	public Query query(UsersRepository usersRepository,
					   TasksRepository taskRepository,
					   ApproachesRepository approachesRepository) {
		return new Query(usersRepository, taskRepository, approachesRepository);
	}

}
