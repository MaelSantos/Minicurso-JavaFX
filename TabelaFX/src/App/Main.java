package App;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
	private Pane tabela;
	private Scene sceneTabela;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			tabela = FXMLLoader.load(getClass().getResource("Tabela.fxml"));
			sceneTabela = new Scene(tabela);
			primaryStage.setScene(sceneTabela);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
