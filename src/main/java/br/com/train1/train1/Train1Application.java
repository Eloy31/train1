package br.com.train1.train1;

import br.com.train1.train1.model.TrainStationsModel;
import br.com.train1.train1.model.UberOnRailsModel;
import br.com.train1.train1.service.PopulationFileService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Train1Application {

	public static void main(String[] args) {
		// SpringApplication.run(Train1Application.class, args);
		PopulationFileService populationFileService = new PopulationFileService();

		List<TrainStationsModel> trainStationsModelList = populationFileService.createTrainStationsList();
		List<UberOnRailsModel> uberOnRailsModels = populationFileService.createUberOnRailsList();
		int a = 0;
	}
}
