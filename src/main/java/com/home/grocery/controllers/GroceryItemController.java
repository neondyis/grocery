package com.home.grocery.controllers;

import com.home.grocery.models.GroceryItem;
import com.home.grocery.services.GroceryItemService;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class GroceryItemController {

    private final GroceryItemService groceryItemService;

    public GroceryItemController(GroceryItemService groceryItemService) {
        this.groceryItemService = groceryItemService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<GroceryItem>> getAllItems() {
        log.info("test info log: getting all Items");
        return new ResponseEntity<>(groceryItemService.getAllGroceryItems(), HttpStatus.OK);
    }

    @PostMapping("/list/add")
    public ResponseEntity<GroceryItem> addItem(@RequestBody GroceryItem item) {
        log.info("test info log: adding an items");
        return new ResponseEntity<>(groceryItemService.addGroceryItem(item), HttpStatus.OK);
    }

    @DeleteMapping("/list/delete/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable ObjectId id) {
        log.info("test info log: deleting an item");
        groceryItemService.deleteGroceryItem(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("/list/edit")
    public ResponseEntity<GroceryItem> editItem(@RequestBody GroceryItem item) {
        log.info("test info log: editing an item");
        return new ResponseEntity<>(groceryItemService.editGroceryItem(item), HttpStatus.OK);
    }
}
