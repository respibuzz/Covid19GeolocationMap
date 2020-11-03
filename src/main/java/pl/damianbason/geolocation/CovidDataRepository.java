package pl.damianbason.geolocation;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CovidDataRepository {

    private List<Point> covidPoints;

    public CovidDataRepository() {
        this.covidPoints = new ArrayList<>();
    }

    public List<Point> getCovidPoints() {
        return covidPoints;
    }

    public void addPoint(Point newPoint) {
        this.covidPoints.add(newPoint);
    }


}
