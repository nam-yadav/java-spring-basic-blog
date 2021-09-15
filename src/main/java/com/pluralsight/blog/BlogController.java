package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {
    private PostRepository postRepository;

    public BlogController(PostRepository postRepository){
        this.postRepository=postRepository;

    }
    @RequestMapping("/")
    public String listPosts(ModelMap modelmap){
        List<Post> posts = postRepository.getAllPosts();
        modelmap.put("posts",posts);
        return "home";
    }

}
