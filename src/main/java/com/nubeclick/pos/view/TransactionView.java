package com.nubeclick.pos.view;

import com.jfoenix.controls.JFXButton;
import com.nubeclick.pos.util.NodeHandler;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class TransactionView {

	// Objects
	private NodeHandler node = new NodeHandler();

	// FXML
	@FXML
	private AnchorPane mainPane;

	@FXML
	private JFXButton btnInventory;

	@FXML
	private JFXButton btnSales;

	@FXML
	private JFXButton btnPurchases;

	@FXML
	private JFXButton btnPrints;

	@FXML
	private void inventoryTx() {
		node.makeTransition("/fxml/InventoryTxFrame.fxml", mainPane);
	}

	@FXML
	private void salesTx() {
		node.makeTransition("/fxml/SalesTxFrame.fxml", mainPane);
	}

	@FXML
	private void purchasesTx() {
		node.makeTransition("/fxml/PurchasesTxFrame.fxml", mainPane);
	}

	@FXML
	private void printsTx() {
		node.makeTransition("/fxml/PrintTxFrame.fxml", mainPane);
	}
}
