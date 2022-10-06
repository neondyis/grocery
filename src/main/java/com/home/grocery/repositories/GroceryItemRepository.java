package com.home.grocery.repositories;

import com.home.grocery.models.GroceryItem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository extends MongoRepository<GroceryItem, ObjectId> {
}
