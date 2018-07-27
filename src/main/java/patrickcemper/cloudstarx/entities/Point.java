package patrickcemper.cloudstarx.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="PointSequence")
public class Point {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PointSequence")
    private Long id;

    @ManyToOne
    @JsonBackReference
    private Place place;

    @ManyToOne
    @JsonBackReference
    private Route route;

    @Column(nullable = false)
    private Double coordX;

    @Column(nullable = false)
    private Double coordY;

    public Point() {
    }

    public Point(Place place, Double coordX, Double coordY) {
        this.place = place;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Point(Route route, Double coordX, Double coordY) {
        this.route = route;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Double getCoordX() {
        return coordX;
    }

    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    public Double getCoordY() {
        return coordY;
    }

    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }

}
