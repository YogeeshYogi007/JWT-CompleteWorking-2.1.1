package io.javabrains.springsecurityjwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.javabrains.springsecurityjwt.models.Client;

public interface ClientRepo extends MongoRepository<Client, Integer>{

	Client findByName(String name);

}
