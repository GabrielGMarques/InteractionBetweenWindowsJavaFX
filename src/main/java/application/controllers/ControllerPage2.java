package application.controllers;

import application.Main;
import javafx.fxml.FXML;

public class ControllerPage2 {

	@FXML
	public void initialize() {
	}

	/**
	 * Chama o método estático da classe Main para solicitar outra página
	 */
	@FXML
	public void onBack() {
		// Solicita a primeira página
		Main.loadScene("/Page1.fxml", "1ªPágina");

	}
}
