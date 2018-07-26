package patrickcemper.cloudstarx.model;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private Long id;
    private String name;
    private String description;
    private List<Line> lines;

    public Route() {
        // Do nothing.
    }

    public Route(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.lines = new ArrayList<>();
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

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

}
