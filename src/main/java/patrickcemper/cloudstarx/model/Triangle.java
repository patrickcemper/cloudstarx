package patrickcemper.cloudstarx.model;

public class Triangle {

    private Long id;

    private Double coordX1;
    private Double coordY1;
    private Double coordX2;
    private Double coordY2;
    private Double coordX3;
    private Double coordY3;

    public Triangle() {
        // Do nothing.
    }

    public Triangle(Long id, Double coordX1, Double coordY1, Double coordX2, Double coordY2, Double coordX3,
                    Double coordY3) {
        this.id = id;
        this.coordX1 = coordX1;
        this.coordY1 = coordY1;
        this.coordX2 = coordX2;
        this.coordY2 = coordY2;
        this.coordX3 = coordX3;
        this.coordY3 = coordY3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getCoordX3() {
        return coordX3;
    }

    public void setCoordX3(Double coordX3) {
        this.coordX3 = coordX3;
    }

    public Double getCoordY3() {
        return coordY3;
    }

    public void setCoordY3(Double coordY3) {
        this.coordY3 = coordY3;
    }

}
