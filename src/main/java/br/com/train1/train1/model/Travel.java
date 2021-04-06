package br.com.train1.train1.model;

import java.util.List;

public class Travel {
    List<ITrainModel> trainModelList;
    List<UberOnRailsModel> uberOnRailsModels;

    public Travel(List<ITrainModel> trainModelList, List<UberOnRailsModel> uberOnRailsModels) {
        this.trainModelList = trainModelList;
        this.uberOnRailsModels = uberOnRailsModels;
    }

    public List<ITrainModel> getTrainModelList() {
        return trainModelList;
    }

    public void setTrainModelList(List<ITrainModel> trainModelList) {
        this.trainModelList = trainModelList;
    }

    public List<UberOnRailsModel> getUberOnRailsModels() {
        return uberOnRailsModels;
    }

    public void setUberOnRailsModels(List<UberOnRailsModel> uberOnRailsModels) {
        this.uberOnRailsModels = uberOnRailsModels;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "trainModelList=" + trainModelList +
                ", uberOnRailsModels=" + uberOnRailsModels +
                '}';
    }
}
