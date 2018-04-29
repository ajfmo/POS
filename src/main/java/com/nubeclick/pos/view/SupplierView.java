package com.nubeclick.pos.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.fxml.FXML;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

public class SupplierView {

	@FXML
	private AnchorPane mainPane;

	@FXML
	private JFXTextField txtSupplierCode;

	@FXML
	private JFXTextField txtSupplierName;

	@FXML
	private JFXTextField txtSupplierAdrsSt;

	@FXML
	private JFXTextField txtSupplierAdrsNumb;

	@FXML
	private JFXTextField txtSupplierNei;

	@FXML
	private JFXTextField txtSupplierCity;

	@FXML
	private JFXTextField txtSupplierState;

	@FXML
	private JFXTextField txtSupplierLP;

	@FXML
	private JFXTextField txtSupplierMP;

	@FXML
	private JFXTextField txtSupplierEmail;

	@FXML
	private JFXTextField txtSearchSupplier;

	@FXML
	private JFXTreeTableView<?> tblSupplier;

	@FXML
	private TreeTableColumn<?, ?> colSupplierCode;

	@FXML
	private TreeTableColumn<?, ?> colSupplierName;

	@FXML
	private TreeTableColumn<?, ?> colSupplierLastName;

	@FXML
	private TreeTableColumn<?, ?> colSupplierAdrs;

	@FXML
	private TreeTableColumn<?, ?> colSupplierMP;

	@FXML
	private JFXButton btnSave;

	@FXML
	private JFXButton btnUpdate;

	@FXML
	private JFXButton btnCancel;

}
