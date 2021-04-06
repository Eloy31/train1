package br.com.train1.train1.model;

import br.com.train1.train1.config.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UberOnRailsModel {
    @Size(max = 8)
    private String trip;

    @Size(max = 3)
    private String origin;

    @Size(max = 3)
    private String destiny;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate departureDate;

    private LocalTime departure;

    private LocalTime arrival;

    private Double value;

    public UberOnRailsModel() {}

    public UberOnRailsModel(@Size(max = 8) String trip, @Size(max = 3) String origin, @Size(max = 3) String destiny, LocalDate departureDate, String departure, String arrival, Double value) {
        this.trip = trip;
        this.origin = origin;
        this.destiny = destiny;
        this.departureDate = departureDate;
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

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
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
}
