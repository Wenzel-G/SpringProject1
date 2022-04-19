package com.WGQuintrix.helloworld.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import com.WGQuintrix.helloworld.entity.Movie;

@RepositoryRestResource(collectionResourceRel="movie", path="movie")
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	Page<Movie> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
	
}
