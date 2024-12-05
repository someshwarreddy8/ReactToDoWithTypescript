package com.kairos.controller;

import com.kairos.Entity.Video;
import com.kairos.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping("addVideo")
    public ResponseEntity<String> addVideo(@RequestBody Video video) {

        videoService.addVideo(video);

        return new ResponseEntity<>("Video is added successfully", HttpStatus.OK);
    }

    @PutMapping("updateVideo")
    public ResponseEntity<String> updateVideo(@RequestBody Video video) {
        videoService.updateVideo(video);
        return new ResponseEntity<>("Video is updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("deleteVideo/{id}")
    public ResponseEntity<String> deleteVideo(@PathVariable Long id) {

        videoService.deleteVideo(id);

        return new ResponseEntity<>("Video is deleted successfully", HttpStatus.OK);
    }

    @GetMapping("getVideos")
    public ResponseEntity<ArrayList<Video>> getVideosList() {
        System.out.println("In video: getVideosList");
        ArrayList<Video> videos;

        videos = videoService.getVideos();
        videos.stream().forEach(video -> video.setCategori(String.valueOf(video.getCategory().getId())));

        return new ResponseEntity<>(videos, HttpStatus.OK);
    }

    @GetMapping("getVideo/{videoId}")
    public ResponseEntity<Video> getVideo(@PathVariable Long videoId) {

        Video video;

        video = videoService.getVideo(videoId);
        video.setCategori(String.valueOf(video.getCategory().getId()));

        return new ResponseEntity<>(video, HttpStatus.OK);
    }
}
