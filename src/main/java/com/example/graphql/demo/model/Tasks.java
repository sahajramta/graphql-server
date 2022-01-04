package com.example.graphql.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Tasks {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="content", nullable = false)
    private String content;

    @Column(name="tags", nullable = false)
    private String tags;

    @Column(name="approach_count", nullable = false)
    private int approachCount;

    @ManyToOne
    @JoinColumn(name = "user_id",
            nullable = false, updatable = false)
    private Users users;

    @Column(name="created_at")
    private String createdAt;

    public Tasks() {
    }

    public Tasks(Long id, String content, String tags, int approachCount, Users users, String createdAt) {
        this.id = id;
        this.content = content;
        this.tags = tags;
        this.approachCount = approachCount;
        this.users = users;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return approachCount == tasks.approachCount && Objects.equals(id, tasks.id) && Objects.equals(content, tasks.content) && Objects.equals(tags, tasks.tags) && Objects.equals(users, tasks.users) && Objects.equals(createdAt, tasks.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, tags, approachCount, users, createdAt);
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getApproachCount() {
        return approachCount;
    }

    public void setApproachCount(int approachCount) {
        this.approachCount = approachCount;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
