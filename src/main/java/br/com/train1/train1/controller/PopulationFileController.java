package br.com.train1.train1.controller;

import br.com.train1.train1.model.TrainStationsModel;
import br.com.train1.train1.service.PopulationFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class PopulationFileController {
    @Autowired
    PopulationFileService populationFileService;

    public List<TrainStationsModel> findAllTrainStations() {
        return populationFileService.createTrainStationsList();
    }
}
