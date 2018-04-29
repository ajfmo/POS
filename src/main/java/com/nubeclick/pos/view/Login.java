package com.nubeclick.pos.view;

import java.util.Optional;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.nubeclick.pos.controller.MenuController;
import com.nubeclick.pos.controller.UserController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class Login {

	// Objects
	private MenuController menu = new MenuController();

	@FXML
	private JFXTextField txtLogin;
	@FXML
	private JFXPasswordField txtPwd;
	@FXML
	private JFXButton btnLogin;

	private int i = 3; // variable para los intentos de ingreso

	private UserController user = new UserController();

	@FXML
	private void login(ActionEvent event) {
		Alert mensaje = null;
		if (user.loginUser("admin", "2374") == true) {
			// if (user.loginUser(txtLogin.getText(), txtPwd.getText()) == true) {
			mensaje = new Alert(AlertType.INFORMATION);
			mensaje.setTitle("Login Exitoso");
			mensaje.setHeaderText("Acceso autorizado!");
			mensaje.setContentText("Bienvenido " + txtLogin.getText());
			Optional<ButtonType> result = mensaje.showAndWait();
			if (result != null) {
				((Node) event.getSource()).getScene().getWindow().hide();
				menu.mainMenu();
			}
		} else if (i <= 1) {
			mensaje = new Alert(AlertType.ERROR);
			mensaje.setTitle("Acceso Denegado");
			mensaje.setHeaderText("Acceso Denegado");
			mensaje.setContentText("Numeros de intentos superado");
			mensaje.showAndWait();
			System.exit(0);
		} else {
			mensaje = new Alert(AlertType.WARNING);
			mensaje.setTitle("Intento fallido");
			mensaje.setHeaderText("Error en las credenciales");
			mensaje.setContentText("Ha ingresado credenciales erradas, tiene " + (i - 1) + " intentos");
			mensaje.showAndWait();
			i--;
			txtLogin.setText("");
			txtPwd.setText("");
		}
	}
}
