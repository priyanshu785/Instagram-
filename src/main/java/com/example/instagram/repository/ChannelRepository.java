package com.example.instagram.repository;

import com.example.instagram.model.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChannelRepository extends MongoRepository<Channel, String> {
    // Custom query methods can be added here
}