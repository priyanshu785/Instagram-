package com.example.instagram.repository;

import com.example.instagram.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VideoRepository extends MongoRepository<Video, String> {
    List<Video> findByUploadedBy(String username);
}
