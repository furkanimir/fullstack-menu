package dev.furkanimir.bbmenu.controller;

import dev.furkanimir.bbmenu.models.Menu;
import dev.furkanimir.bbmenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/all")
    public ResponseEntity<List<Menu>> allMenu(){
        return new ResponseEntity<List<Menu>>(menuService.allItems(),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public Optional<Menu> getSingleItem(@PathVariable String id){
        Optional<Menu> kemalKilicdar = menuService.getSingleItem(id);
        if (kemalKilicdar.isPresent()) {
            return kemalKilicdar;
        }else {
            throw new RuntimeException("Item id not found - " + id);
        }
    }

    //https://www.youtube.com/watch?v=kYiLzIiHVY8 --3828
    @PostMapping("/ekle")
    public Menu ssave(@RequestBody Menu menu){
        return menuService.saveDeneme(menu);
    }

    @PutMapping("/ekle")
    public Menu update(@RequestBody Menu menu){
        return menuService.update(menu);
    }



    //    Calışıyor
//    @DeleteMapping("/delete/{id}")
//    public void ddelete(@PathVariable String id){
//        menuService.deletebyId(id);
//    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> ddelete(@PathVariable String id){
        boolean isRemoved = menuService.deletebyId(id);
        if(!isRemoved)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(id,HttpStatus.OK);
    }

//    @DeleteMapping(value = "/delete/{id}")
//    public ResponseEntity<String> deletePost(@PathVariable String id) {
//
//        var isRemoved = menuService.delete(id);
//
//        if (!isRemoved) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }





//    @PutMapping("/update/{id}")
//    public Menu savve(@PathVariable String id, @RequestBody){
//        return menuService.saveWithId(menu);
//    }


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


