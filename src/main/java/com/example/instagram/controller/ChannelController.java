package com.example.instagram.controller;

import com.example.instagram.model.Channel;
import com.example.instagram.model.Video;
import com.example.instagram.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/channels")
public class ChannelController {
    @Autowired
    private ChannelService channelService;

    @PostMapping
    public Channel createChannel(@RequestBody Channel channel) {
        return channelService.createChannel(channel);
    }

    @GetMapping("/{id}")
    public Optional<Channel> getChannelById(@PathVariable String id) {
        return channelService.getChannelById(id);
    }

    @GetMapping("/{id}/videos")
    public List<Video> getVideosByChannel(@PathVariable String id) {
        return channelService.getVideosByChannel(id);
    }

    @DeleteMapping("/{id}")
    public void deleteChannel(@PathVariable String id) {
        channelService.deleteChannel(id);
    }

    @PutMapping("/{id}")
    public Channel updateChannel(@PathVariable String id, @RequestBody Channel channel) {
        channel.setId(id); // Ensure the channel ID is set correctly
        return channelService.updateChannel(channel);
    }
}