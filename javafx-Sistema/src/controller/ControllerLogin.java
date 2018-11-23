package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import model.BaseDados;
import model.Usuario;
import view.Alerta;
import view.Main;

public class ControllerLogin  implements Initializable{

    @FXML
    private PasswordField senhaFld;

    @FXML
    private TextField loginFld;

    @FXML
    private Button cadastroBnt;

    @FXML
    private Button loginBtn;
  
    private ParallelTransition paralle;
    
    @FXML
    void actionHandle(ActionEvent e) {
    	if(e.getSource() == loginBtn) {
	    	if(BaseDados.logar(new Usuario(loginFld.getText(), senhaFld.getText())))
	    		paralle.play();
	    	else {
	       		Alerta.getInstance().mostrarAlerta("","Usuario não cadastrado",AlertType.ERROR);
	    	}
    	}else if(e.getSource() == cadastroBnt) {
    		BaseDados.usuarios.add(new Usuario(loginFld.getText(), senhaFld.getText()));
    		Alerta.getInstance().mostrarAlerta("","Novo usuário cadastrado",AlertType.INFORMATION);
    	}
    }
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ScaleTransition scale = new ScaleTransition();
		scale.setFromX(1);
		scale.setFromY(1);
		scale.setToX(4);
		scale.setToY(4);
		scale.setNode(loginBtn);
		scale.setDuration(new Duration(1000));
		FadeTransition fade = new FadeTransition();
		fade.setFromValue(1);
		fade.setToValue(0);
		fade.setNode(loginBtn);
		fade.setDuration(new Duration(1000));
		paralle = new ParallelTransition();
		paralle.getChildren().add(scale);
		paralle.getChildren().add(fade);
		
		paralle.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Main.mudarTela(Main.TELA_HOME);
			}
		});
	}

}
