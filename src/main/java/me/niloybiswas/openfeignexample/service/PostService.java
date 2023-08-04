package me.niloybiswas.openfeignexample.service;

import lombok.AllArgsConstructor;
import me.niloybiswas.openfeignexample.client.PostClient;
import me.niloybiswas.openfeignexample.dto.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {

    private PostClient postClient;

    public List<Post> getBookData() {
        String token = "Bearer I am authorization token";
        return postClient.getPosts(token);
    }

}
