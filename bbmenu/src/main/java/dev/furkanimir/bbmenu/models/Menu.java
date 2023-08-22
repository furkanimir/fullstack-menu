package dev.furkanimir.bbmenu.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    private String id;
    private String type;
    private String header;
    private String description;
    private String img;
    private float price;

    public Menu(String type, String header, String description, String img, float price) {
        this.type = type;
        this.header = header;
        this.description = description;
        this.img = img;
        this.price = price;
    }

    //olmazsa sil--id ile olan constructor
//    public Menu(String id, String type, String header, String description, String img, float price) {
//        this.id = id;
//        this.type = type;
//        this.header = header;
//        this.description = description;
//        this.img = img;
//        this.price = price;
//    }
}
