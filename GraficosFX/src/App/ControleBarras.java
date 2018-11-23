package App;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class ControleBarras implements Initializable{

	@FXML
	private BarChart<String, Integer> barras;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		XYChart.Series<String, Integer> series = new Series<>();
		series.getData().add(new Data<String, Integer>("A", 6));
		series.getData().add(new Data<String, Integer>("B", 5));
		series.getData().add(new Data<String, Integer>("C", -6));
		series.getData().add(new Data<String, Integer>("D", 10));
		
		barras.getData().add(series);
		barras.setTitle("Grafico de Barras");
		
	}

}
