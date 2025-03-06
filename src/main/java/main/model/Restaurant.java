package main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Restaurants")
public class Restaurant {

    @Id
    private String id;

    private String name;
    private String location;
    private String cuisineType;
    private double averagePrice;

    public Restaurant() {}

    public Restaurant(String name, String location, String cuisineType, double averagePrice) {
        this.name = name;
        this.location = location;
        this.cuisineType = cuisineType;
        this.averagePrice = averagePrice;
    }
}
