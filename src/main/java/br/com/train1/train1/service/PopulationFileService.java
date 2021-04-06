package br.com.train1.train1.service;

import br.com.train1.train1.model.ITrainModel;
import br.com.train1.train1.model.TrainStationsModel;
import br.com.train1.train1.model.UberOnRailsModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationFileService {
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
    * Retornar Classe ITrain
    * */
    public List<ITrainModel> createITrainList() {
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "/files/iTrain.csv"));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

            List<String[]> trains = csvReader.readAll();
            List<ITrainModel> iTrainModels = new ArrayList<>();
            for(String[] train: trains){
                ITrainModel iTrainModel = new ITrainModel();
                iTrainModel.setTripNumber(train[0]);
                iTrainModel.setOriginStation(train[1]);
                iTrainModel.setDestinalStation(train[2]);
                iTrainModel.setDate(train[3]);
                iTrainModel.setDepartureTime(train[4]);
                iTrainModel.setArrivalTime(train[5]);
                iTrainModel.setPrice(Double.parseDouble(train[6]));

                iTrainModels.add(iTrainModel);
            }
            return iTrainModels;
        } catch (IOException e) {
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
