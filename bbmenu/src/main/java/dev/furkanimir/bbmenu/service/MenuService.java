package dev.furkanimir.bbmenu.service;

import dev.furkanimir.bbmenu.models.Menu;
import dev.furkanimir.bbmenu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//https://www.youtube.com/watch?v=ssj0CGxv60k --40:55
@Service //business logic
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> allItems(){
        return menuRepository.findAll();
    }

    public Optional<Menu> getSingleItem(String id){
        return menuRepository.findById(id);
    }

    public Menu saveDeneme(Menu menu){
        return menuRepository.save(menu);
    }
    public Menu update(Menu menu){
        Menu updateResponse = menuRepository.save(menu);
        return updateResponse;
    }
//    çalışıyor
    public boolean deletebyId(String id){
        if (menuRepository.existsById(id)){
            menuRepository.deleteById(id);
//            System.out.println(id + " başarı ile silindi");
            return true;
        }else {
//            System.out.println(id+ "numaralı id bulunamadı");
            return false;
        }

    }




}


//itemId'yi sildim
//    public Optional<Menu> findItemByItemId(String itemId) {
//        return menuRepository.findItemByItemId(itemId);
//    }

