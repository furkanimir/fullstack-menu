package dev.furkanimir.bbmenu.repository;

import dev.furkanimir.bbmenu.models.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends MongoRepository<Menu, String> {
}

//itemId'yi sildim
//    Optional<Menu> findItemByItemId(String itemId);
