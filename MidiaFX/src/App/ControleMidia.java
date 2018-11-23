package App;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ControleMidia implements Initializable {

	@FXML
	private MediaView midia;

	@FXML
	private Button btnPlay;

	private MediaPlayer player;
	private Media media;

	@FXML
	void action(ActionEvent event) {

		
		player.play();

		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		media = new Media(getClass().getResource("Fullmetal.mp4").toString());

		player = new MediaPlayer(media);

		midia.setMediaPlayer(player);
		
	}

	@FXML
	void error(ActionEvent event) {

		String message = player.errorProperty().get().getMessage();
        System.err.println(message);
		
	}

}