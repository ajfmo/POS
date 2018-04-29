package com.nubeclick.pos.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

public class PurchaseView {

	// FXML
	@FXML
	private AnchorPane mainPane;

	@FXML
	private Label lblPurchaseTicket;

	@FXML
	private Label lblPurchaseDate;

	@FXML
	private Label lblPurchaseTotal;

	@FXML
	private JFXComboBox<?> cboEmployeeID;

	@FXML
	private JFXComboBox<?> cboDepositID;

	@FXML
	private JFXTextField txtSupplierCode;

	@FXML
	private JFXButton btnAddSupplier;

	@FXML
	private JFXTextField txtSupplierDescription;

	@FXML
	private JFXButton btnTotal;

	@FXML
	private JFXButton btnPrint;

	@FXML
	private JFXButton btnCancel;

	@FXML
	private JFXTreeTableView<?> tblPurchasesProduct;

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

}
