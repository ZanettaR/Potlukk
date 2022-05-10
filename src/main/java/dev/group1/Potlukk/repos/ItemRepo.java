package dev.group1.Potlukk.repos;

import dev.group1.Potlukk.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {
}
