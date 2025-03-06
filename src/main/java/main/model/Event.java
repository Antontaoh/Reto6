package main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "Events")
public class Event {

    @Id
    private String id;

    private String name;
    private LocalDateTime date;
    private String description;
    private double price;

    public Event() {}

    public Event(String name, LocalDateTime date, String description, double price) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.price = price;
    }
}
