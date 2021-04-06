package br.com.train1.train1.model;

import javax.validation.constraints.Size;

public class TrainStationsModel {
    private String name;

    @Size(max = 3)
    private String station;

    private String city;

    public TrainStationsModel(String name, @Size(max = 3) String station, String city) {
        this.name = name;
        this.station = station;
        this.city = city;
    }

    public TrainStationsModel() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "TrainStationsModel{" +
                "name='" + name + '\'' +
                ", station='" + station + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
