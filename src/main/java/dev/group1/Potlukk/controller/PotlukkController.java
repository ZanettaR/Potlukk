package dev.group1.Potlukk.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class PotlukkController {

    // Add a new potlukk
    @PostMapping("/potlukks")

    // Add an item to a potlukk
    @PostMapping("/items")

    // Add an item to a potlukk (nested)
    @PostMapping("/potlukk/{id}/items")

    // Add new user
    @PostMapping("/users")

    // Look at all potlukks
    @GetMapping("/potlukks")

    // Look at a specific potlukks info
    @GetMapping("potlukks/{id}")

    // Get a user
    @GetMapping("/user/{id}")

    // Look at a potlukks items
    // Should be able to sort/get by status
    @GetMapping("/potlukk/{id}/items")

    // Update Potlukk
    @PutMapping("/potlukk/{id}")

    // Update Item
    @PutMapping("/items{id}")

    // Update User
    @PutMapping("/users{id}")

    // Change status methods
    @PatchMapping("/items/{id}/wanted")
    @PatchMapping("/items/{id}/needed")
    @PatchMapping("/items/{id}/fulfilled")

    // Delete a potlukk
    @DeleteMapping("potlukk/{id}")

    // Remove an item from the list
    @DeleteMapping("/items/{id}")

    // Remove a user
    @DeleteMapping("/delete/{id}")

}
