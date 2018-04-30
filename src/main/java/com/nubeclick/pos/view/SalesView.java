package com.nubeclick.pos.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

public class SalesView implements Initializable {

	// FXML
	@FXML
	private AnchorPane mainPane;

	@FXML
	private Label lblSaleTicket;

	@FXML
	private Label lblSaleDate;

	@FXML
	private Label lblSaleTotal;

	@FXML
	private JFXComboBox<?> cboCashierID;

	@FXML
	private JFXComboBox<?> cboDepositID;

	@FXML
	private JFXTextField txtClientCode;

	@FXML
	private JFXButton btnAddClient;

	@FXML
	private JFXTextField txtClientDescription;

	@FXML
	private AnchorPane btnSave;

	@FXML
	private JFXButton btnTotal;

	@FXML
	private JFXButton btnPrint;

	@FXML
	private JFXButton btnCancel;

	@FXML
	private JFXTreeTableView<?> tblSalesProduct;

	@FXML
	private TreeTableColumn<?, ?> colProductCode;

	@FXML
	private TreeTableColumn<?, ?> colProductDescr;

	@FXML
	private TreeTableColumn<?, ?> colProductPrice;

	@FXML
	private TreeTableColumn<?, ?> colProductQty;

	@FXML
	private TreeTableColumn<?, ?> colProductTotalPrice;

	@FXML
	private JFXButton btnAddProduct;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TextFields.bindAutoCompletion(txtClientCode, possibleSuggestions);
		// TextFields.bindAutoCompletion(txtClientDescription, possibleSuggestions);
	}

}
