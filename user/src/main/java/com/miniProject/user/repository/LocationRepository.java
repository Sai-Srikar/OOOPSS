package com.miniProject.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.miniProject.user.entities.Location;

@Repository
public interface LocationRepository extends MongoRepository<Location,String>{

}
