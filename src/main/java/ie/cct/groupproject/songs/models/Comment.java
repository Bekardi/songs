package ie.cct.groupproject.songs.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
@Data
//annotation for creating our constructor that takes care of all fields and turnings then into arguments
@AllArgsConstructor
//this annotation is for creating constructor without args
@NoArgsConstructor
public class Comment {

    @Id
    private ObjectId id;
    private String body;
}
