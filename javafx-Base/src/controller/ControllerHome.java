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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

//maelsantos777@gmail.com
public class ControllerHome implements Initializable {

    @FXML
    private BorderPane menuPane;
    
    @FXML
    private Button clientesBtn;

    @FXML
    private Button dadosBtn;

    @FXML
    private Button estatisticasBtn;

    @FXML
    private Button menuBtn;
    
    private TranslateTransition t;
    Pane telaTeste;
    
    @FXML
    private AnchorPane pane;
    
    private boolean menuAtivo = true;
    @FXML
    void actionHadeler(ActionEvent e) {
    		if(e.getSource() == menuBtn) {
    			if(menuAtivo) {
    				t.setFromX(0);
    				t.setToX(-130);
    				menuAtivo = false;
    			}else {
    				t.setFromX(-130);
    				t.setToX(0);
    				menuAtivo = true;
    			}
    			t.play();
    		}else if(e.getSource() == clientesBtn) {
    			//
    			pane.getChildren().setAll(telaTeste);
    		}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			telaTeste = FXMLLoader.load(getClass().getClassLoader().getResource("view/TelaTeste.fxml"));
			t = new TranslateTransition();
			t.setDuration(new Duration(1000));
			t.setNode(menuPane);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
