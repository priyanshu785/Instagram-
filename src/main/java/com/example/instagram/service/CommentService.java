package com.example.instagram.service;

import com.example.instagram.model.Comment;
import com.example.instagram.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByVideoId(String videoId) {
        return commentRepository.findByVideoId(videoId);
    }

    public void deleteComment(String commentId) {
        commentRepository.deleteById(commentId);
    }

    public Optional<Comment> getCommentById(String commentId) {
        return commentRepository.findById(commentId);
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }
}