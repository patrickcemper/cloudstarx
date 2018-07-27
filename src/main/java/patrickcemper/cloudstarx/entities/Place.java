package patrickcemper.cloudstarx.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@SequenceGenerator(name="PlaceSequence")
public class Place {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PlaceSequence")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double rating;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Point> points;

    public Place() {
    }

    public Place(String name, String description, Double rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Set<Point> getPoints() {
        return points;
    }

    public void setPoints(Set<Point> points) {
        this.points = points;
    }

}
