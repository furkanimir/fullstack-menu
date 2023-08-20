package dev.furkanimir.bbmenu.service;

import dev.furkanimir.bbmenu.models.Menu;
import dev.furkanimir.bbmenu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> allItems(){
        return menuRepository.findAll();
    }



}
