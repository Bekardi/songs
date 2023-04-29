package ie.cct.groupproject.songs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ie.cct.groupproject.songs.models.Student;
public interface StudentRepository extends MongoRepository<Student, String> {

}
