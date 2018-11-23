package App;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	private Pane midia;
	private Scene sceneMidia;

	@Override
	public void start(Stage primaryStage) {

		try {
			midia = FXMLLoader.load(getClass().getResource("Midia.fxml"));
			sceneMidia = new Scene(midia);
			primaryStage.setScene(sceneMidia);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
