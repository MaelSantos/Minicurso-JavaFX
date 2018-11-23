package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ControllerHome implements Initializable
{

    @FXML
    private Button clienteBnt;

    @FXML
    private Button dadosBtn;

    @FXML
    private Button estatisticaBtn;

    @FXML
    private Button menuBtn;

    @FXML
    private BorderPane menuPane;

    @FXML
    private AnchorPane pane;
    
    private TranslateTransition transition;
    
    private boolean menuAtivo = true;
    
    Pane telaCastroCliente;
   	Pane telaDados ;
   	Pane telaEstatistica ;

    @FXML
    void actionHandle(ActionEvent e) {
    	if(e.getSource() == clienteBnt) {
    		pane.getChildren().setAll(telaCastroCliente);
    	}else if(e.getSource() == dadosBtn) {
    		pane.getChildren().setAll(telaDados);
    	}else if(e.getSource() == estatisticaBtn) {
    		pane.getChildren().setAll(telaEstatistica);
    	}else if(e.getSource() == menuBtn) {
    		if(!menuAtivo) {
    			transition.setFromX(-130);
    			transition.setToX(0);
    			menuAtivo = true;
    		}else {
    			transition.setFromX(0);
    			transition.setToX(-130);
    			menuAtivo = false;
    		}
    		transition.play();
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			telaCastroCliente = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaCadastroCliente.fxml"));
			telaDados = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaDados.fxml"));
			telaEstatistica = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaEstatistica.fxml"));
			transition = new TranslateTransition();
			transition.setNode(menuPane);
			transition.setDuration(new Duration(500));
		} catch (IOException e) {
			System.out.println("Erro aqui");
			e.printStackTrace();
		}
	}
    
}
