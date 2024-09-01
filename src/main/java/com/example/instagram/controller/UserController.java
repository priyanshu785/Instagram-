package com.example.instagram.controller;

import com.example.instagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{userId}/subscribe/{channelId}")
    public void subscribeChannel(@PathVariable String userId, @PathVariable String channelId) {
        userService.subscribeChannel(userId, channelId);
    }

    @PostMapping("/{userId}/like/{videoId}")
    public void likeVideo(@PathVariable String userId, @PathVariable String videoId) {
        userService.likeVideo(userId, videoId);
    }

    @PostMapping("/{userId}/watch/{videoId}")
    public void addToWatchHistory(@PathVariable String userId, @PathVariable String videoId) {
        userService.addToWatchHistory(userId, videoId);
    }
}