package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "car_id")
    private long id;

    @OneToOne (fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "car_id")
    private User user;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    public Car() {
    }

    public Car(String model, int series, User user) {
        this.model = model;
        this.series = series;
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
