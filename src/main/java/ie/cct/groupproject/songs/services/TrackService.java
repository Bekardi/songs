package ie.cct.groupproject.songs.services;

import ie.cct.groupproject.songs.models.Track;
import ie.cct.groupproject.songs.repositories.TrackRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TrackService {
    //reference of the repository
    // (autowired instantiates the class for us, so we don't need initialize this instance)
    @Autowired
    private TrackRepository trackRepository;

    //db access method
    public List<Track> allTracks() {
        //findAll() described in the Mongo Repository Class and it returns a list of the datatype that we
        //defined in the TrackRepository class
        return trackRepository.findAll();
    }


    public Track findOne(ObjectId id) {
        Optional<Track> foundTrack = trackRepository.findById(id);
        return foundTrack.orElse(null);
    }
}
