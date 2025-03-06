package main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Hotels")
public class Hotel {

    @Id
    private String id;

    private String name;
    private String address;
    private int stars;

    public Hotel() {}

    public Hotel(String name, String address, int stars) {
        this.name = name;
        this.address = address;
        this.stars = stars;
    }
}
