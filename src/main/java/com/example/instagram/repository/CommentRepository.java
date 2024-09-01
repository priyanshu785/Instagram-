package com.example.instagram.repository;

import com.example.instagram.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByVideoId(String videoId);
    // Custom query methods can be added here
}