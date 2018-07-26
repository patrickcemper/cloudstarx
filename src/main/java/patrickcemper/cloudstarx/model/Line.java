package patrickcemper.cloudstarx.model;

public class Line {

    private Long id;
    private Route route;

    private Double coordX1;
    private Double coordY1;
    private Double coordX2;
    private Double coordY2;

    public Line() {
        // Do nothing.
    }

    public Line(Long id, Route route, Double coordX1, Double coordY1, Double coordX2, Double coordY2) {
        this.id = id;
        this.route = route;
        this.coordX1 = coordX1;
        this.coordY1 = coordY1;
        this.coordX2 = coordX2;
        this.coordY2 = coordY2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Double getCoordX1() {
        return coordX1;
    }

    public void setCoordX1(Double coordX1) {
        this.coordX1 = coordX1;
    }

    public Double getCoordY1() {
        return coordY1;
    }

    public void setCoordY1(Double coordY1) {
        this.coordY1 = coordY1;
    }

    public Double getCoordX2() {
        return coordX2;
    }

    public void setCoordX2(Double coordX2) {
        this.coordX2 = coordX2;
    }

    public Double getCoordY2() {
        return coordY2;
    }

    public void setCoordY2(Double coordY2) {
        this.coordY2 = coordY2;
    }

}
