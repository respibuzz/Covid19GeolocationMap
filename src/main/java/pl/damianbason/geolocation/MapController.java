package pl.damianbason.geolocation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {

    private CovidDataRepository covidDataRepository;

    public MapController(CovidDataRepository covidDataRepository) {
        this.covidDataRepository = covidDataRepository;
    }

    @GetMapping
    public String getMap(Model model){
        model.addAttribute("pointList", covidDataRepository.getCovidPoints());

        return "geolocationmap";
    }
}

