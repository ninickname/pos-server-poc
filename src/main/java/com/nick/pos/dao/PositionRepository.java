package com.nick.pos.dao;

import com.nick.pos.model.Position;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "position", path = "position")
public interface PositionRepository extends MongoRepository<Position,String> {

}
