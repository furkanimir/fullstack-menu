package dev.furkanimir.bbmenu.controller;

import dev.furkanimir.bbmenu.models.Menu;
import dev.furkanimir.bbmenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/all")
    public ResponseEntity<List<Menu>> allMenu(){
        return new ResponseEntity<List<Menu>>(menuService.allItems(),HttpStatus.OK);
    }

    //https://www.youtube.com/watch?v=kYiLzIiHVY8 --3828
    @PostMapping("/ekle")
    public Menu ssave(@RequestBody Menu menu){
        return menuService.saveDeneme(menu);
    }



}






//itemId'yi sildim
//    @GetMapping("/{itemId}")
//    public ResponseEntity<Optional<Menu>> getSingleMovie(@PathVariable String itemId){
//        return new ResponseEntity<Optional<Menu>>(menuService.findItemByItemId(itemId), HttpStatus.OK);
//    }


//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Menu>> getSingleItem(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Menu>>(menuService.singleItem(id),HttpStatus.OK);
//    }


