package com.food.zesty.bite.repository;

import com.food.zesty.bite.entity.MenuItem;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface MenultemRepository extends MongoRepository<MenuItem,String> {

}
