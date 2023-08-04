package me.niloybiswas.openfeignexample.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import me.niloybiswas.openfeignexample.dto.Post;
import me.niloybiswas.openfeignexample.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PostController {

    @NonNull
    private final PostService postService;

    @GetMapping("/posts")
    public ResponseEntity<?> getAllPosts() {
        final List<Post> posts = postService.getBookData();
        return ResponseEntity.ok().body(posts);
    }

}
