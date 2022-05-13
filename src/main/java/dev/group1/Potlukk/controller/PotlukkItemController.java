package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.Item;
import dev.group1.Potlukk.services.ItemService;
import dev.group1.Potlukk.services.PotlukkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class PotlukkItemController {

    @Autowired
    private PotlukkService potlukkService;
    @Autowired
    private ItemService itemService;

    // Look at a potlukks items
    // Should be able to sort/get by status
    @GetMapping("/potlukks/{id}/items")
    public List<Item> getItemsByPotlukk(@PathVariable int id){
        return itemService.getItemsByPotlukk(id);
    }

    // Add an item to a potlukk (nested)
    @PostMapping("/potlukks/{id}/items")
    public Item postItemToPotlukk(@RequestBody Item item){
        return potlukkService.addPotlukkItem(item);
    }
}
