package com.kairos.service;

import com.kairos.Entity.Category;
import com.kairos.Entity.Video;
import com.kairos.repository.CategoryRepo;
import com.kairos.repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VideoService {
    @Autowired
    private VideoRepo videoRepo;
    @Autowired
    private CategoryRepo categoryRepo;

    public void addVideo(Video video) {
        try {
            Category category = categoryRepo.findById(Long.parseLong(video.getCategori())).get();
            video.setCategory(category);
        } catch (Exception ex) {
            throw new RuntimeException("Exception while getting category by id", ex);
        }
        try {
            videoRepo.save(video);
        } catch (Exception ex) {
            throw new RuntimeException("Exception while adding video", ex);
        }
    }

    public void updateVideo(Video video) {
        Video videoById = null;
        Optional<Category> category = null;
        try {
            videoById = videoRepo.findById(video.getId()).get();
            videoById.setTitle(video.getTitle());
            videoById.setDescription(video.getDescription());
            videoById.setUrl(video.getUrl());
            videoById.setLikes(video.getLikes());
            videoById.setDisLikes(video.getDisLikes());
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while updating video with id", e);
        }
        try {
            category = categoryRepo.findById(Long.parseLong(video.getCategori()));
            videoById.setCategory(category.get());
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while getting category to update video", e);
        }

        videoRepo.save(videoById);
    }

    public ArrayList<Video> getVideos() {
        try {
            return (ArrayList<Video>) videoRepo.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while getting all the videos.", e);
        }
    }

    public Video getVideo(Long videoId) {
        try {
            return videoRepo.findById(videoId).get();
        } catch (Exception ex) {
            throw new RuntimeException("Error occurred while getting the video with id: " + videoId, ex);

        }
    }

    public void deleteVideo(Long id) {
        try {
            videoRepo.deleteById(id);
        } catch (Exception ex) {
            throw new RuntimeException("Error occurred while deleting video with id: " + id, ex);
        }
    }
}
