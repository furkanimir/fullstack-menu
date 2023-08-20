package dev.furkanimir.bbmenu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuController {

    @GetMapping("/All")
    public ResponseEntity<String> allMenu(){
        return new  ResponseEntity<String>("All menu", HttpStatus.OK);
    }

}
