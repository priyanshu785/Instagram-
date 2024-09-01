package com.example.instagram.service;

import com.example.instagram.model.Channel;
import com.example.instagram.model.Video;
import com.example.instagram.repository.ChannelRepository;
import com.example.instagram.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChannelService {
    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private VideoRepository videoRepository;

    public ChannelService(ChannelRepository channelRepository, VideoRepository videoRepository) {
        this.channelRepository = channelRepository;
        this.videoRepository = videoRepository;
    }

    public Channel createChannel(Channel channel) {
        return channelRepository.save(channel);
    }

    public Optional<Channel> getChannelById(String channelId) {
        return channelRepository.findById(channelId);
    }

    public List<Video> getVideosByChannel(String channelId) {
        Optional<Channel> channel = channelRepository.findById(channelId);
        if (channel.isPresent()) {
            List<String> videoIds = channel.get().getVideoIds();
            return videoRepository.findAllById(videoIds);
        }
        return List.of(); // Return an empty list if the channel doesn't exist
    }

    public void deleteChannel(String channelId) {
        channelRepository.deleteById(channelId);
    }

    public Channel updateChannel(Channel channel) {
        return channelRepository.save(channel);
    }
}