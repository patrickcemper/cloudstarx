package patrickcemper.cloudstarx.services;

import patrickcemper.cloudstarx.entities.Place;
import patrickcemper.cloudstarx.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class PlaceService {

    public static List<Place> createTestData() {
        List<Place> places = new ArrayList<>();
        places.add(createDonaupark());
        places.add(createDonauZentrum());
        places.add(createAlbertSchultzEishalle());
        places.add(createVetMedVienna());
        return places;
    }

    private static Place createDonaupark() {
        Place place = new Place("Donaupark", "Large park with rose, lily, herb & moorland gardens, a lake & 250m " +
                "tower on a former landfill site. ((c) 2018 Google)", Math.round(Math.random()*90) / 10.0 + 1.0);
        List<Point> points = new ArrayList<>();
        points.add(new Point(place, 16.412099, 48.244009));
        points.add(new Point(place, 16.420760, 48.240103));
        points.add(new Point(place, 16.416781, 48.237134));
        points.add(new Point(place, 16.414131, 48.237215));
        points.add(new Point(place, 16.409511, 48.234966));
        points.add(new Point(place, 16.403293, 48.240014));
        points.add(new Point(place, 16.410419, 48.242525));
        place.setPoints(points);
        return place;
    }

    private static Place createDonauZentrum() {
        Place place = new Place("Donau Zentrum", "A shopping center in Vienna's 22nd district " +
                "of Donaustadt. ((c) 2018 Wikipedia, Google)", Math.round(Math.random()*90) / 10.0 + 1.0);
        List<Point> points = new ArrayList<>();
        points.add(new Point(place, 16.435435, 48.244481));
        points.add(new Point(place, 16.438265, 48.243144));
        points.add(new Point(place, 16.439932, 48.242860));
        points.add(new Point(place, 16.438684, 48.240538));
        points.add(new Point(place, 16.436439, 48.240803));
        points.add(new Point(place, 16.433810, 48.243023));
        place.setPoints(points);
        return place;
    }

    private static Place createAlbertSchultzEishalle() {
        Place place = new Place("Albert Schultz Eishalle", "Albert Schultz Eishalle is an indoor sporting arena " +
                "located in Vienna, Austria. ((c) 2018 Wikipedia)", Math.round(Math.random()*90) / 10.0 + 1.0);
        List<Point> points = new ArrayList<>();
        points.add(new Point(place, 16.433072, 48.247131));
        points.add(new Point(place, 16.433030, 48.246526));
        points.add(new Point(place, 16.434128, 48.246532));
        points.add(new Point(place, 16.434096, 48.245518));
        points.add(new Point(place, 16.432722, 48.245580));
        points.add(new Point(place, 16.432326, 48.245756));
        points.add(new Point(place, 16.432312, 48.247149));
        place.setPoints(points);
        return place;
    }

    private static Place createVetMedVienna() {
        Place place = new Place("VetMed Vienna", "The University of Veterinary Medicine Vienna was founded " +
                "in 1767 as the world's third school for veterinary medicine (after Lyon and Alfort) by Milan's " +
                "Ludovico Scotti. ((c) 2018 Wikipedia)", Math.round(Math.random()*90) / 10.0 + 1.0);
        List<Point> points = new ArrayList<>();
        points.add(new Point(place, 16.434621, 48.258363));
        points.add(new Point(place, 16.431967, 48.254735));
        points.add(new Point(place, 16.430088, 48.251495));
        points.add(new Point(place, 16.428294, 48.252024));
        points.add(new Point(place, 16.428003, 48.253370));
        points.add(new Point(place, 16.430985, 48.257519));
        place.setPoints(points);
        return place;
    }

}
