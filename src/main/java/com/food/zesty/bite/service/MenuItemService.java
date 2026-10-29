package com.food.zesty.bite.service;

import com.food.zesty.bite.entity.MenuItem;
import com.food.zesty.bite.repository.MenultemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {
@Autowired
private MenultemRepository manuItemRepository;
public List<MenuItem> getAllMenuItems(){
    return manuItemRepository.findAll();
  }
//public MenuItem addMenuItem(MenuItem menuItem){
//   return manuItemRepository.save(menuItem);
//   }
public List<MenuItem> addMenuItems (List<MenuItem> menuItems){
    return manuItemRepository.saveAll(menuItems);
  }
  public void deleteMenuItem(String id ){
    manuItemRepository.deleteById(id);
  }

  public MenuItem updateMenuItem(String id, MenuItem newItem){
    MenuItem existing = manuItemRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Item not found:"+id));
    existing.setPrice(newItem.getPrice());
    existing.setName(newItem.getName());
    existing.setCategory(newItem.getCategory());
    existing.setDescription(newItem.getDescription());
    existing.setVeg(newItem.isVeg());

    return manuItemRepository.save(existing);
  }

}
