package com.home.grocery.models;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
public class GroceryItem {
    @Id
    private ObjectId id;
    private String name;
    private int amount;
    private boolean bought;
}
