package dev.group1.Potlukk.repos;

import dev.group1.Potlukk.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

    default List<Item> getAllItemsFromPotlukk(int id) {
        List<Item> allItems = this.findAll();
        List<Item> itemsFromPotlukk = new ArrayList<>();
        allItems.stream().filter(i -> i.getPotlukkID() == id).forEach(itemsFromPotlukk::add);
        return itemsFromPotlukk;
    }
}
