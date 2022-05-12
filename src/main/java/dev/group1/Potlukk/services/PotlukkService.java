package dev.group1.Potlukk.services;

import dev.group1.Potlukk.entities.Item;
import dev.group1.Potlukk.entities.Potlukk;
import dev.group1.Potlukk.exceptions.PotlukkNotFoundException;

import java.util.List;

public interface PotlukkService {

    Potlukk addPotlukk(Potlukk potlukk);

    Potlukk updatePotlukk(Potlukk potlukk);

    boolean deletePotlukkById(int id) throws PotlukkNotFoundException;

    boolean addPotlukkItem(Item item) throws PotlukkNotFoundException;

    Potlukk getPotlukkById(int id) throws PotlukkNotFoundException;

    List<Potlukk> getAllPotlukks();

    List<Item> getPotlukkItems(int id) throws PotlukkNotFoundException;

}
