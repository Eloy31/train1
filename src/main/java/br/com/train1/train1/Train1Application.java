package br.com.train1.train1;

import br.com.train1.train1.model.ITrainModel;
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

		List<TrainStationsModel> trainStationsModels = populationFileService.createTrainStationsList();
		List<UberOnRailsModel> uberOnRailsModels = populationFileService.createUberOnRailsList();
		List<ITrainModel> iTrainModels = populationFileService.createITrainList();
		int a = 0;
	}
}
