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
    //http status 200 = standard response indicating that request has succeeded
//    @GetMapping
//    public ResponseEntity<List<Track>> getAllTracks() {
//
//        List<Track> shortList = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            shortList.add(trackService.allTracks().get(i));
//        }
//        return new ResponseEntity<List<Track>>(shortList, HttpStatus.OK);
//    }

    @GetMapping()
    public ModelAndView getTrackView() {
        ModelAndView mav = new ModelAndView("tracksView");
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

//    @GetMapping("/{id}")
//    public String getTrack(@PathVariable ObjectId id, Model model) {
//        Track track = trackService.singleTrack(id).orElse(null);
//        model.addAttribute("track", track);
//        System.out.println(track.getTrack_name());
//        return "bitch"; // returns the "track.html" template
//    }
//    @GetMapping("/{id}")
//    public String getSingleTrack(@PathVariable ObjectId id, Model themodel) {
//        Optional<Track> response = trackService.singleTrack(id);
//        Track track = response.orElse(null);
//        System.out.println(track.getTrack_name().toString());
//        themodel.addAttribute("track", track.getTrack_name());
//        return "page";
//    }

