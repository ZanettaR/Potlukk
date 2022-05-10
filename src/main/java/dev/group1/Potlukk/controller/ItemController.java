package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class ItemController {

    // Add an item to a potlukk
    @PostMapping("/items")
    public Item postItem(){
        return null;
    }

    // Update Item
    @PutMapping("/items{id}")
    public Item putItem(@PathVariable int id){
        return null;
    }

    // Change status methods
    @PatchMapping("/items/{id}/wanted")
    public Item patchWanted(@PathVariable int id){
        return null;
    }

    @PatchMapping("/items/{id}/needed")
    public Item patchNeeded(@PathVariable int id){
        return null;
    }

    @PatchMapping("/items/{id}/fulfilled")
    public Item patchFulfilled(@PathVariable int id){
        return null;
    }

    // Remove an item from the list
    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable int id){

    }
}
