package application.controllers;

import application.Main;
import javafx.fxml.FXML;

public class ControllerPag1 {

	@FXML
	public void initialize() {
	}

	/**
	 * Chama o método estático da classe Main para solicitar outra página
	 */
	@FXML
	public void goPage2() {
		// Solicita a segunda página
		Main.loadScene("/Page2.fxml", "2ª Página");

	}
}
