package web.domain;

public class Car {
    private Long id;
    private String model;
    private byte series;

    public Car() {
    }

    public Car(Long id, String model, byte series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public byte getSeries() {
        return series;
    }

    public void setSeries(byte series) {
        this.series = series;
    }
}
