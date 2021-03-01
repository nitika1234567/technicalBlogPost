package com.upgrad.TechnicalBlogApplication.service;

import com.upgrad.TechnicalBlogApplication.model.Post;
import com.upgrad.TechnicalBlogApplication.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;

import java.util.List;

@Service
public class PostService {
@Autowired
private PostRepository postRepository;

    public List<Post> getAllPosts() {

       // EntityManager entityManager=entityManagerFactory.createEntityManager();
      //TypedQuery<Post> query= entityManager.createQuery("SELECT p from Post p",Post.class);
       // List<Post> result=query.getResultList();
       // return result;
        return postRepository.getAllPosts();
    }

    public void createPost(Post newPost) {
        postRepository.createPost(newPost);

    }
    public void deletePost(Integer postId)
    {
        postRepository.deletePost(postId);
    }
}
