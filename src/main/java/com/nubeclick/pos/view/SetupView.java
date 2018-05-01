package com.nubeclick.pos.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import com.nubeclick.pos.controller.SetupController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

public class SetupView implements Initializable {

	@FXML
	private AnchorPane setupPane;

	@FXML
	private JFXTabPane setupTab;

	@FXML
	private Tab tabParameters;

	@FXML
	private Tab tabRoles;

	@FXML
	private Tab tabUser;

	@FXML
	private Tab tabEmployees;

	@FXML
	private Tab tabAbout;

	// Role vars

	@FXML
	private JFXTextField txtRoleId;

	@FXML
	private JFXTextField txtRoleDescription;

	@FXML
	private JFXTextField txtRoleLevel;

	@FXML
	private JFXTreeTableView<?> roleTableList;

	@FXML
	private TreeTableColumn<?, ?> colRoleID;

	@FXML
	private TreeTableColumn<?, ?> colRoleDescription;

	@FXML
	private TreeTableColumn<?, ?> colRoleLevel;

	// User vars

	@FXML
	private JFXTreeTableView<?> userTableList;

	@FXML
	private TreeTableColumn<?, ?> colUserID;

	@FXML
	private TreeTableColumn<?, ?> colUserName;

	@FXML
	private TreeTableColumn<?, ?> colUserLogin;

	@FXML
	private TreeTableColumn<?, ?> colUserRole;

	@FXML
	private JFXTextField txtUserID;

	@FXML
	private JFXTextField txtUserName;

	@FXML
	private JFXComboBox<?> cboUserRol;

	@FXML
	private JFXTextField txtUserLogin;

	@FXML
	private JFXPasswordField txtUserPassword;

	// Employee vars

	@FXML
	private JFXTreeTableView<?> employeeTableList;

	@FXML
	private TreeTableColumn<?, ?> colEmployeeID;

	@FXML
	private TreeTableColumn<?, ?> colEmployeeName;

	@FXML
	private TreeTableColumn<?, ?> colEmployeeAddress;

	@FXML
	private TreeTableColumn<?, ?> colEmployeePhone;

	@FXML
	private JFXTextField txtEmployeeID;

	@FXML
	private JFXTextField txtEmployeeName;

	@FXML
	private JFXTextField txtEmployeeAddress;

	@FXML
	private JFXPasswordField txtEmployeePhone;

	// Action Buttons

	@FXML
	private JFXButton btnSave;

	@FXML
	private JFXButton btnUpdate;

	@FXML
	private JFXButton btnCancel;

	@FXML
	private Alert msg;

	private String tab;

	private SetupController<?> setup = new SetupController();

	/**********************/

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		setupTab.getSelectionModel().getSelectedItem().getText();

		// Get the selectec tab
		System.out.println(setupTab.getSelectionModel().getSelectedItem().getText());

		setupTab.setOnMouseClicked(e -> {
			tab = setupTab.getSelectionModel().getSelectedItem().getText();
			System.out.println(setupTab.getSelectionModel().getSelectedItem().getText());
		});
	}

	@FXML
	private void save() {
		if (tab.equals("Parametros Generales")) {
		}
		if (tab.equals("Roles")) {
			setup.saveRole(txtRoleDescription.getText(), Integer.parseInt(txtRoleLevel.getText()));
			System.out.println("Parametros Guardados");
		}
	}

	@FXML
	private void update() {
		if (tab.equals("Parametros Generales")) {
			System.out.println("Parametros Guardados");
		}
	}

	@FXML
	private void cancel() {
		txtRoleId.setText(null);
		txtRoleDescription.setText(null);
		txtRoleLevel.setText(null);
		txtUserID.setText(null);
		txtUserName.setText(null);
		txtUserLogin.setText(null);
		txtUserPassword.setText(null);
		txtEmployeeID.setText(null);
		txtEmployeeName.setText(null);
		txtEmployeeAddress.setText(null);
		txtEmployeePhone.setText(null);
	}

}