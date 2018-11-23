package App;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

public class ControlePizza implements Initializable{

    @FXML
    private PieChart pizza;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		pizza.getData().add(new PieChart.Data("A", 6));
		pizza.getData().add(new PieChart.Data("B", 5));
		pizza.getData().add(new PieChart.Data("C", -6));
		pizza.getData().add(new PieChart.Data("D", 10));
		
		pizza.setTitle("Grafico de Pizza");
		
	}

}
