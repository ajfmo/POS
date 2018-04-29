package com.nubeclick.pos.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;

import javafx.fxml.FXML;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

public class ClientView {
	
	// FXML
	@FXML
	private AnchorPane mainPane;

	@FXML
	private JFXTextField txtClientCode;

	@FXML
	private JFXTextField txtClienteName;

	@FXML
	private JFXTextField txtClientFL;

	@FXML
	private JFXTextField txtClientML;

	@FXML
	private JFXTextField txtClientLP;

	@FXML
	private JFXTextField txtClientMP;

	@FXML
	private JFXTextField txtClientAdrs;

	@FXML
	private JFXTextField txtClientNI;

	@FXML
	private JFXTextField txtClientNO;

	@FXML
	private JFXTextField txtClientNei;

	@FXML
	private JFXTextField txtClientTown;

	@FXML
	private JFXButton btnSave;

	@FXML
	private JFXTreeTableView<?> tblClient;

	@FXML
	private TreeTableColumn<?, ?> colClientCode;

	@FXML
	private TreeTableColumn<?, ?> colClientName;

	@FXML
	private TreeTableColumn<?, ?> colClientLastName;

	@FXML
	private TreeTableColumn<?, ?> colClientAdrs;

	@FXML
	private TreeTableColumn<?, ?> colClientMP;

	@FXML
	private JFXButton btnUpdate;

	@FXML
	private JFXButton btnCancel;

	@FXML
	private JFXTextField txtSearchClient;
}
