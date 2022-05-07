package com.mateuspessoa.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mateuspessoa.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
