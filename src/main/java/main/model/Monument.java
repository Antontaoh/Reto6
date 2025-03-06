package main.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Monuments")
public class Monument {

    @Id
    private String id;

    private String name;
    private String creationDate;
    private String location;
    private String description;

    public Monument() {}

    public Monument(String name, String creationDate, String location, String description) {
        this.name = name;
        this.creationDate = creationDate;
        this.location = location;
        this.description = description;
    }
}
