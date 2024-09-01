package com.example.instagram.service;

import com.example.instagram.model.Video;
import com.example.instagram.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public Video uploadVideo(Video video) {
        video.setLikeCount(0);
        video.setViewCount(0);
        return videoRepository.save(video);
    }

    public void incrementLikeCount(String videoId) {
        Video video = videoRepository.findById(videoId).orElse(null);
        if (video != null) {
            video.setLikeCount(video.getLikeCount() + 1);
            videoRepository.save(video);
        }
    }

    public void decrementLikeCount(String videoId) {
        Video video = videoRepository.findById(videoId).orElse(null);
        if (video != null) {
            video.setLikeCount(video.getLikeCount() - 1);
            videoRepository.save(video);
        }
    }
    public Video getVideoById(String videoId){
        Video video= videoRepository.findById(videoId).get();
        return video;
    }
    public void incrementViewCount(String videoId) {
        Video video = videoRepository.findById(videoId).orElse(null);
        if (video != null) {
            video.setViewCount(video.getViewCount() + 1);
            videoRepository.save(video);
        }
    }
}