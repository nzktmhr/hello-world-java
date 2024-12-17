package com.example.memoapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String content;
    
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    
    // Getters and Setters
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
    
    public LocalDateTime getCreatedAt() {
      return createdAt;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
    }
}
