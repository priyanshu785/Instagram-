package com.example.instagram.service;

import com.example.instagram.model.User;
import com.example.instagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void subscribeChannel(String userId, String channelId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null && !user.getSubscribedChannels().contains(channelId)) {
            user.getSubscribedChannels().add(channelId);
            userRepository.save(user);
        }
    }

    public void likeVideo(String userId, String videoId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            if (!user.getLikedVideos().contains(videoId)) {
                user.getLikedVideos().add(videoId);// Remove dislike if exists
                userRepository.save(user);
            }
        }
    }


    public void addToWatchHistory(String userId, String videoId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null && !user.getWatchHistory().contains(videoId)) {
            user.getWatchHistory().add(videoId);
            userRepository.save(user);
        }
    }
}