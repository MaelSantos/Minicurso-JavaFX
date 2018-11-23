package controller;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import model.BaseDados;
import model.Cliente;
import model.Util;

public class ControllerCadastroCliente  implements Initializable{

    @FXML
    private TextField nomeFld;

    @FXML
    private DatePicker nascimentoPck;

    @FXML
    private ComboBox<String> sexoBox;

    @FXML
    private Button cancelarBtn;

    @FXML
    private Button cadastroBtn;

    @FXML
    void actionHandle(ActionEvent e) {
    	if(e.getSource() == cadastroBtn) {
    		BaseDados.clientes.add(new Cliente(nomeFld.getText(),sexoBox.getValue(),Util.toDate(nascimentoPck)));
    		Alert alerta = new Alert(AlertType.INFORMATION);
    		alerta.setContentText("Sucesso ao cadastrar cliente");
    		alerta.show();
    		limparCampos();
    	}else if(e.getSource() == cancelarBtn) {
    		limparCampos();
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sexoBox.getItems().addAll(new String[] {"MASCULINO","FEMININO","OUTRO"});
	}
	
	private void limparCampos() {
		nomeFld.setText("");
		sexoBox.setValue(null);
		nascimentoPck.setValue(null);
	}

}
