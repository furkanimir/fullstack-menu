package dev.furkanimir.bbmenu.controller;

import dev.furkanimir.bbmenu.models.Menu;
import dev.furkanimir.bbmenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/all")
    public ResponseEntity<List<Menu>> allMenu(){
        return new ResponseEntity<List<Menu>>(menuService.allItems(),HttpStatus.OK);//1:04:37
    }

}
