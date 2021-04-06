package br.com.train1.train1.model;

import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

public class UberOnRailsModel {
    @Size(max = 8)
    private String trip;

    @Size(max = 3)
    private String origin;

    @Size(max = 3)
    private String destiny;

    private LocalDate departureDate;

    private LocalTime departure;

    private LocalTime arrival;

    private Double value;

    public UberOnRailsModel() {}

    public UberOnRailsModel(@Size(max = 8) String trip, @Size(max = 3) String origin, @Size(max = 3) String destiny, String departureDate, String departure, String arrival, Double value) {
        this.trip = trip;
        this.origin = origin;
        this.destiny = destiny;
        this.departureDate = LocalDate.parse(departureDate);
        this.departure = LocalTime.parse(departure);
        this.arrival = LocalTime.parse(arrival);
        this.value = value;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = LocalDate.parse(departureDate);
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = LocalTime.parse(departure); }

    public LocalTime getArrival() {
       return arrival; }

    public void setArrival(String arrival) {
        this.arrival = LocalTime.parse(arrival); }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "UberOnRailsModel{" +
                "trip='" + trip + '\'' +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", departureDate=" + departureDate +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", value=" + value +
                '}';
    }
}
