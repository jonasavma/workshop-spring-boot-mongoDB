package br.com.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.workshopmongo.domain.Post;


public interface PostRepository  extends MongoRepository<Post, String> {
	
	
	
	
	

}
