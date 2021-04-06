package br.com.train1.train1.model;

import br.com.train1.train1.config.LocalDateDeserializer;
import br.com.train1.train1.config.LocalDateSerializer;
import br.com.train1.train1.config.LocalDateTimeDeserializer;
import br.com.train1.train1.config.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

public class ITrainModel {
    @Size(max=6)
    private String tripNumber;

    @Size(max = 3)
    private String originStation;

    @Size(max = 3)
    private String destinalStation;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalTime departureTime;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalTime arrivalTime;

    private Double price;

    public ITrainModel(@Size(max = 6) String tripNumber, @Size(max = 3) String originStation, @Size(max = 3) String destinalStation, LocalDate date, LocalTime departureTime, LocalTime arrivalTime, Double price) {
        this.tripNumber = tripNumber;
        this.originStation = originStation;
        this.destinalStation = destinalStation;
        this.date = date;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getOriginStation() {
        return originStation;
    }

    public void setOriginStation(String originStation) {
        this.originStation = originStation;
    }

    public String getDestinalStation() {
        return destinalStation;
    }

    public void setDestinalStation(String destinalStation) {
        this.destinalStation = destinalStation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
