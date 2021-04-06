package br.com.train1.train1.model;

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

    private LocalDate date;

    private LocalTime departureTime;

    private LocalTime arrivalTime;

    private Double price;

    public ITrainModel(@Size(max = 6) String tripNumber, @Size(max = 3) String originStation, @Size(max = 3) String destinalStation, String date, String departureTime, String arrivalTime, Double price) {
        this.tripNumber = tripNumber;
        this.originStation = originStation;
        this.destinalStation = destinalStation;
        this.date = LocalDate.parse(date);
        this.departureTime = LocalTime.parse(departureTime);
        this.arrivalTime = LocalTime.parse(arrivalTime);
        this.price = price;
    }

    public ITrainModel() {}

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

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = LocalTime.parse(departureTime);
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = LocalTime.parse(arrivalTime);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ITrainModel{" +
                "tripNumber='" + tripNumber + '\'' +
                ", originStation='" + originStation + '\'' +
                ", destinalStation='" + destinalStation + '\'' +
                ", date=" + date +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", price=" + price +
                '}';
    }
}
