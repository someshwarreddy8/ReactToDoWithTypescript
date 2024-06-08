package com.kairos.service;

import com.kairos.Entity.Category;
import com.kairos.Entity.Video;
import com.kairos.repository.CategoryRepo;
import com.kairos.repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VideoService {
    @Autowired
    private VideoRepo videoRepo;
    @Autowired
    private CategoryRepo categoryRepo;
    public void addVideo(Video video) {
        try {
            Category category = categoryRepo.findById(video.getCategoryId().getId()).get();
            video.setCategoryId(category);
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
            category = categoryRepo.findById(video.getCategoryId().getId());
            videoById.setCategoryId(category.get());
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while getting category to update video", e);
        }

        videoRepo.save(videoById);
    }
}
