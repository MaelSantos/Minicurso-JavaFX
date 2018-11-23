package controller;

import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import model.BaseDados;
import model.Cliente;
import model.Util;

public class ControllerEstatistica {

    @FXML
    private Button attBtn;

    @FXML
    private BarChart<String,Number> barChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    void actionHandle(ActionEvent event) {
    	gerarGraficoBarra(BaseDados.clientes);
    }
    
    private void gerarGraficoBarra(Set<Cliente> clientes) {
    	barChart.getData().clear();
    	barChart.getData().add(Util.gerarSerieNomeVsMesNascimento(clientes));
    }

}
