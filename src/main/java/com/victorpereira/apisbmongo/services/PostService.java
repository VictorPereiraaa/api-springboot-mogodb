package com.victorpereira.apisbmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorpereira.apisbmongo.domain.Post;
import com.victorpereira.apisbmongo.domain.User;
import com.victorpereira.apisbmongo.dto.UserDTO;
import com.victorpereira.apisbmongo.repository.PostRepository;
import com.victorpereira.apisbmongo.repository.UserRepository;
import com.victorpereira.apisbmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}