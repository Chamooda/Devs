package com.gsoc.model;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoId;

    private String description;
    private String title;
    @ElementCollection
    private Set<String> tags=new HashSet<>();
    private Integer likes;
    @ElementCollection
    private HashMap<String,String>comments;

    private String videoUrl;
    @ManyToOne
    private User user;


    public Video(Long videoId, String description, String title, Set<String> tags, Integer likes, HashMap<String, String> comments, String videoUrl, User user) {
        this.videoId = videoId;
        this.description = description;
        this.title = title;
        this.tags = tags;
        this.likes = likes;
        this.comments = comments;
        this.videoUrl = videoUrl;
        this.user = user;
    }


    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public HashMap<String, String> getComments() {
        return comments;
    }

    public void setComments(HashMap<String, String> comments) {
        this.comments = comments;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Video() {
    }
}
