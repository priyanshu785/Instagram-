package com.example.instagram.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private String profilePictureUrl;
    private List<String> subscribedChannels; // List of channel IDs the user is subscribed to
    private List<String> watchHistory; // List of video IDs the user has watched
    private List<String> likedVideos;
    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getSubscribedChannels() {
        return subscribedChannels;
    }

    public void setSubscribedChannels(List<String> subscribedChannels) {
        this.subscribedChannels = subscribedChannels;
    }

    public List<String> getWatchHistory() {
        return watchHistory;
    }

    public void setWatchHistory(List<String> watchHistory) {
        this.watchHistory = watchHistory;
    }

    public List<String> getLikedVideos() {
        return likedVideos;
    }

    public void setLikedVideos(List<String> likedVideos) {
        this.likedVideos = likedVideos;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }
}