package com.kairos.service;

import com.kairos.Entity.Comment;
import com.kairos.Entity.Video;
import com.kairos.repository.CommentRepo;
import com.kairos.repository.VideoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private VideoRepo videoRepo;

    public void addComment(Comment comment) {
        try {
            Optional<Video> byVideoId = videoRepo.findById(comment.getVideoId().getId());
            comment.setVideoId(byVideoId.get());
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while getting video.", e);
        }
        try {
            commentRepo.save(comment);
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred while saving comment.", ex);
        }
    }
}
