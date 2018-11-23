package App;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
	private Pane grafico;
	private Scene sceneGrafico;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			grafico = FXMLLoader.load(getClass().getResource("Area.fxml"));
			sceneGrafico = new Scene(grafico);
			primaryStage.setScene(sceneGrafico);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
