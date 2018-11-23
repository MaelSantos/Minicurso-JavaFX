package view;

import javafx.scene.control.Alert;

public class Alerta extends Alert{
	private static Alerta instance;
	
	public Alerta() {
		super(AlertType.INFORMATION);
	}
	
	public static Alerta getInstance() {
		if(instance == null)
			instance = new Alerta();
		return instance;
	}
	
	public void mostrarAlerta(String titulo, String msg, AlertType tipo) {
		instance.setAlertType(tipo);
		instance.setTitle(titulo);
		instance.setContentText(msg);
		instance.show();
	}
}
