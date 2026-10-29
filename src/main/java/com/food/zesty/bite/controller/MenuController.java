package com.food.zesty.bite.controller;

import com.food.zesty.bite.entity.MenuItem;
import com.food.zesty.bite.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static java.awt.SystemColor.menu;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    private MenuItemService menuItemService;
    @GetMapping
    public List<MenuItem> getAllMenuItems(){
        return menuItemService.getAllMenuItems();
    }
   @PostMapping
    public ResponseEntity<List<MenuItem>> addMenuItems(@RequestBody List<MenuItem> menuItems){
        List<MenuItem>savedItems=menuItemService.addMenuItems(menuItems);
        return new ResponseEntity<>(savedItems, HttpStatus.OK);
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMenuItem(@PathVariable String id ){
        menuItemService.deleteMenuItem(id);
        return new ResponseEntity<>("delete",HttpStatus.OK);
   }
@PutMapping("/{id}")
    public ResponseEntity<MenuItem> updataMenuItem(@PathVariable String id ,@RequestBody MenuItem menuItem){
        MenuItem updated = menuItemService.updateMenuItem(id, menuItem);
        return new ResponseEntity<>(updated,HttpStatus.OK);
}
}
