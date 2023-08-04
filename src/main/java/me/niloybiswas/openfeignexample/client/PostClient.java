package me.niloybiswas.openfeignexample.client;

import me.niloybiswas.openfeignexample.config.PostClientConfig;
import me.niloybiswas.openfeignexample.dto.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "PostClient", url = "https://jsonplaceholder.typicode.com/", configuration = PostClientConfig.class)
public interface PostClient {

    @GetMapping(path = "/posts")
    List<Post> getPosts(@RequestHeader(value = "Authorization", required = true) String token);

}
