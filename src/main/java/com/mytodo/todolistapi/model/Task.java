package com.mytodo.todolistapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean completed = false;
    private LocalDateTime created = LocalDateTime.now();

    public Long getId() {
        return id;
    }
    public void setID(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public LocalDateTime getCreated() {
        return created;
    }
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
    public Task() {}
    public Task(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Task [id=" + id + ", title=" + title + ", completed=" + completed + "]+/n";
    }
}
