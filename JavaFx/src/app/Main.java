package app;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	private static Pane login, home;
	private static Scene sceneLogin, sceneHome;
	private static Stage palco;
	
	@Override
	public void start(Stage stage) {
		try {
			Main.palco = stage;
			login = FXMLLoader.load(getClass().getClassLoader().getResource("view/Login.fxml"));
			home = FXMLLoader.load(getClass().getClassLoader().getResource("view/Home.fxml"));
			sceneLogin = new Scene(login);
			sceneHome = new Scene(home);
			stage.setScene(sceneLogin);
			stage.centerOnScreen();
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void mudarTelaHome() {
		palco.setScene(sceneHome);
	}
	
	public static void mudarTelaLogin() {
		palco.setScene(sceneLogin);
	}
	
}
