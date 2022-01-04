package com.example.graphql.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Approaches {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="content", nullable = false)
    private String content;

    @Column(name="vote_count", nullable = false)
    private int voteCount;

    @ManyToOne
    @JoinColumn(name = "user_id",
            nullable = false, updatable = false)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "task_id",
            nullable = false, updatable = false)
    private Tasks tasks;

    @Column(name="created_at")
    private String createdDate;

    public Approaches() {
    }

    public Approaches(Long id, String content, int voteCount, Users users, Tasks tasks, String createdDate) {
        this.id = id;
        this.content = content;
        this.voteCount = voteCount;
        this.users = users;
        this.tasks = tasks;
        this.createdDate = createdDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Approaches that = (Approaches) o;
        return voteCount == that.voteCount && Objects.equals(id, that.id) && Objects.equals(content, that.content) && Objects.equals(users, that.users) && Objects.equals(tasks, that.tasks) && Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, voteCount, users, tasks, createdDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
