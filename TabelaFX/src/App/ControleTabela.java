package App;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControleTabela implements Initializable {

	@FXML
	private TableView<Pessoa> tblPessoa;

	@FXML
	private TableColumn<Pessoa, String> colNome;

	@FXML
	private TableColumn<Pessoa, Integer> colIdade;

	@FXML
	private TableColumn<Pessoa, String> colCpf;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		tblPessoa.getItems().addAll(
				new Pessoa("Mael", 20, "000.000.000-00"), 
				new Pessoa("Wanderson", 20, "111.111.111-11"));
		
		colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		colCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
						
	}

}
