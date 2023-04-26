package ie.cct.groupproject.songs.models;

import lombok.AllArgsConstructor;
import lombok.Data; //takes care of all getters and setters, toString methods, so we don't have to write it
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "songs")
@Data
//annotation for creating our constructor that takes all fields ass arguments
@AllArgsConstructor
//this annotation is for creating constructor without args
@NoArgsConstructor
public class Track {
    private ObjectId id;
    private String track_id;
    private String artists;
    private String album_name;
    private String track_name;
    private int popularity;
    private int duration_ms;
    private Boolean explicit;
    private double danceability;
    private double energy;
    private int key;
    private double loudness;
    private int mode;
    private double speechiness;
    private double acousticness;
    private double intrumentalness;
    private double liveness;
    private double valence;
    private double tempo;
    private int time_signature;
    private String track_genre;
//    @DocumentReference
//    private List<Comment> commentsIds;
}
