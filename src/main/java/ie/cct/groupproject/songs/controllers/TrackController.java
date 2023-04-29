package ie.cct.groupproject.songs.controllers;

import ie.cct.groupproject.songs.models.Track;
import ie.cct.groupproject.songs.services.TrackService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/tracks")
public class TrackController {
    @Autowired
    private TrackService trackService;

    //returning the html file with tracks data
    @GetMapping()
    public ModelAndView getTrackView() {
        ModelAndView mav = new ModelAndView("Tracks/tracksView");
        List<Track> tracks = trackService.allTracks();
        List<Track> shortList = tracks.subList(0, 100);
        mav.addObject("tracks", shortList );
        return mav;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Track> getSingleTrack(@PathVariable ObjectId id) {
        return new ResponseEntity<Track>(trackService.findOne(id), HttpStatus.OK);
    }
}

