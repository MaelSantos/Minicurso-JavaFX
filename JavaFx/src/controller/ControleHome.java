package controller;

import app.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;

public class ControleHome {

    @FXML
    private Button cadastroButton;

    @FXML
    private Button consultasButton;

    @FXML
    private BarChart<String,String> barChart;

    @FXML
    private Button sairButton;

    
    @FXML
    void actionHandler(ActionEvent event) {
    	if(event.getSource() == sairButton) {
    		Main.mudarTelaLogin();
    	}
    }

}
