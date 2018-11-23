package controller;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.BaseDados;
import model.Cliente;

public class ControllerDados implements Initializable{

    @FXML
    private Button attBtn;

    @FXML
    private TableView<Cliente> clienteTbl;

    @FXML
    private TableColumn<Cliente,String> nomeClm;

    @FXML
    private TableColumn<Cliente, Date> nascimentoClm;

    @FXML
    private TableColumn<Cliente, String> sexoClm;

    @FXML
    void actionHandle(ActionEvent event) {
    	clienteTbl.getItems().clear();
    	clienteTbl.getItems().addAll(BaseDados.clientes);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nomeClm.setCellValueFactory(new PropertyValueFactory<>("nome"));
		nascimentoClm.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
		sexoClm.setCellValueFactory(new PropertyValueFactory<>("sexo"));
	}

}
