package ie.cct.groupproject.songs.repositories;

import ie.cct.groupproject.songs.models.Track;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/* Spring Data MongoDB library - provides a set of methods for performing CRUD operations on a MongoDB database
*   specifies the Track entity class and the type of ObjectId
* (Helps to perform CRUD operations)
* */
public interface TrackRepository extends MongoRepository<Track, ObjectId> {
}
