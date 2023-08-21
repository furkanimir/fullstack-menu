package dev.furkanimir.bbmenu.service;

import dev.furkanimir.bbmenu.models.Menu;
import dev.furkanimir.bbmenu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//https://www.youtube.com/watch?v=ssj0CGxv60k --40:55
@Service //business logic
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> allItems(){
        return menuRepository.findAll();
    }

    public Menu saveDeneme(Menu menu){
        return menuRepository.save(menu);
    }






}

//itemId'yi sildim
//    public Optional<Menu> findItemByItemId(String itemId) {
//        return menuRepository.findItemByItemId(itemId);
//    }

