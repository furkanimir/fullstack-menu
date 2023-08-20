package dev.furkanimir.bbmenu.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    private ObjectId id;
    private String type;
    private String header;
    private String description;
    private String img;
    private float price;
}
