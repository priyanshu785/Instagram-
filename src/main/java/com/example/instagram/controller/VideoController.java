package com.example.instagram.controller;

import com.example.instagram.model.Video;
import com.example.instagram.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping
    public Video uploadVideo(@RequestBody Video video) {
        return videoService.uploadVideo(video);
    }


    @GetMapping("/{id}")
    public Video getVideo(@PathVariable String id) {
        return videoService.getVideoById(id);
    }

    @PostMapping("/{id}/like")
    public void incrementLikeCount(@PathVariable String id) {
        videoService.incrementLikeCount(id);
    }

    @PostMapping("/{id}/view")
    public void incrementViewCount(@PathVariable String id) {
        videoService.incrementViewCount(id);
    }
}

