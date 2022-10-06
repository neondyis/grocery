package com.home.grocery.services;

import com.home.grocery.models.GroceryItem;
import com.home.grocery.repositories.GroceryItemRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService {
    private final GroceryItemRepository repository;

    public GroceryItemService(GroceryItemRepository repository) {
        this.repository = repository;
    }

    public List<GroceryItem> getAllGroceryItems(){
        return repository.findAll();
    }

    public GroceryItem addGroceryItem(GroceryItem groceryItem){
        return repository.save(groceryItem);
    }

    public GroceryItem editGroceryItem(GroceryItem item){
        return repository.save(item);
    }

    public void deleteGroceryItem(ObjectId id){
        repository.deleteById(id);
    }
}
