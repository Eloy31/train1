package br.com.train1.train1.service;

import br.com.train1.train1.model.TrainStationsModel;
import br.com.train1.train1.model.UberOnRailsModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PopulationFileService {
    private final String path = System.getProperty("user.dir") + "/files/";

    /*
    * Retornar Classe TrainStations
    * */
    public List<TrainStationsModel> createTrainStationsList() {
        try {
            String file = System.getProperty("user.dir") + "/files/trainStations.json";
            String json = readFileAsString(file);
            final ObjectMapper objectMapper = new ObjectMapper();
            List<TrainStationsModel> trainStationsModels = objectMapper.readValue(json, new TypeReference<List<TrainStationsModel>>(){});
            return trainStationsModels;
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    * Retornar Classe UberOnRails
    * */
    public List<UberOnRailsModel> createUberOnRailsList() {
        try {
            String file = System.getProperty("user.dir") + "/files/uberOnRails.json";
            String json = readFileAsString(file);
            final ObjectMapper objectMapper = new ObjectMapper();
            List<UberOnRailsModel> uberOnRailsModel = objectMapper.readValue(json, new TypeReference<List<UberOnRailsModel>>(){});
            return uberOnRailsModel;
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    * Converter Json em String
    * */
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
