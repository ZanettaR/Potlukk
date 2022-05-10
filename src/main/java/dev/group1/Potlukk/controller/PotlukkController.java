package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.Item;
import dev.group1.Potlukk.entities.Potlukk;
import dev.group1.Potlukk.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@Controller
public class PotlukkController {

    // Add a new potlukk
    @PostMapping("/potlukks")
    @ResponseBody
    public Potlukk postPotlukk(){
        return null;
    }

    // Add an item to a potlukk
    @PostMapping("/items")
    @ResponseBody
    public Item postItem(){
        return null;
    }

    // Add an item to a potlukk (nested)
    @PostMapping("/potlukk/{id}/items")
    @ResponseBody
    public Item postItemToPotlukk(){
        return null;
    }

    // Add new user
    @PostMapping("/users")
    @ResponseBody
    public User postUser(){
        return null;
    }

    // Look at all potlukks
    @GetMapping("/potlukks")
    @ResponseBody
    public List<Potlukk> getPotlukks(){
        return null;
    }


    // Look at a specific potlukks info
    @GetMapping("potlukks/{id}")
    @ResponseBody
    public Potlukk getPotlukkByID(@PathVariable int id){
        return null;
    }

    // Get a user
    @GetMapping("/user/{id}")
    public User getUserByID(@PathVariable int id){
        return null;
    }


    // Look at a potlukks items
    // Should be able to sort/get by status
    @GetMapping("/potlukk/{id}/items")
    public List<Item> getItemsByPotlukk(@PathVariable int id){
        return null;
    }

    // Update Potlukk
    @PutMapping("/potlukk/{id}")
    @ResponseBody
    public Potlukk putPotlukk(@PathVariable int id){
        return null;
    }

    // Update Item
    @PutMapping("/items{id}")
    public Item putItem(@PathVariable int id){
        return null;
    }

    // Update User
    @PutMapping("/users{id}")
    @ResponseBody
    public User putUser(@PathVariable int id){
        return null;
    }

    // Change status methods
    @PatchMapping("/items/{id}/wanted")
    @ResponseBody
    public Item patchWanted(@PathVariable int id){
        return null;
    }
    @PatchMapping("/items/{id}/needed")
    @ResponseBody
    public Item patchNeeded(@PathVariable int id){
        return null;
    }
    @PatchMapping("/items/{id}/fulfilled")
    @ResponseBody
    public Item patchFulfilled(@PathVariable int id){
        return null;
    }

    // Delete a potlukk
    @DeleteMapping("potlukk/{id}")
    @ResponseBody
    public void deletePotlukk(@PathVariable int id){

    }

    // Remove an item from the list
    @DeleteMapping("/items/{id}")
    @ResponseBody
    public void deleteItem(@PathVariable int id){

    }

    // Remove a user
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable int id){

    }

}
