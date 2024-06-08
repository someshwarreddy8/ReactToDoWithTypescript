package com.kairos.controller;

import com.kairos.Entity.Comment;
import com.kairos.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comment")
public class CommentsController {
    @Autowired
    private CommentService commentService;

    @PostMapping("addComment")
    public ResponseEntity<String> addComment(@RequestBody Comment comment) {

        commentService.addComment(comment);

        return new ResponseEntity<>("Comment added successfully.", HttpStatus.OK);
    }
    @GetMapping("getComment")
    public ResponseEntity<Comment> getComment(@RequestParam String commentId) {

        Comment comment = new Comment();

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }
}
