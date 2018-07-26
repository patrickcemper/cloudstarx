package patrickcemper.cloudstarx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Place {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Double rating;

//    private List<Triangle> triangles;

    public Place() {
        // Do nothing.
    }

    public Place(String name, String description, Double rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
//        this.triangles = new ArrayList<>();
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

//    public List<Triangle> getTriangles() {
//        return triangles;
//    }
//
//    public void setTriangles(List<Triangle> triangles) {
//        this.triangles = triangles;
//    }

}
