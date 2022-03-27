package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
