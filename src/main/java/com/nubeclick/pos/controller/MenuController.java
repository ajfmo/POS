package com.nubeclick.pos.controller;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXListView;
import com.nubeclick.pos.util.NodeHandler;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController implements Initializable {

	// Objects
	private NodeHandler node = new NodeHandler();

	// FXML
	@FXML
	private AnchorPane mainPane;

	@FXML
	private JFXListView<String> menuList;

	/**********************/

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		List<String> menuEntries = Arrays.asList("Configuracion", "Proveedores", "Inventario", "Compras", "Clientes",
				"Ventas", "Movimientos");

		menuList.setItems(FXCollections.observableList(menuEntries));

		menuList.setOnMousePressed(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (menuList.getSelectionModel().getSelectedItem().equals("Configuracion")) {
					node.makeTransition("/fxml/SetupFrame.fxml", mainPane);
				}
				if (menuList.getSelectionModel().getSelectedItem().equals("Proveedores")) {
					node.makeTransition("/fxml/SupplierFrame.fxml", mainPane);
				}
				if (menuList.getSelectionModel().getSelectedItem().equals("Inventario")) {
					node.makeTransition("/fxml/InventoryFrame.fxml", mainPane);
				}
				if (menuList.getSelectionModel().getSelectedItem().equals("Compras")) {
					node.makeTransition("/fxml/PurchaseFrame.fxml", mainPane);
				}
				if (menuList.getSelectionModel().getSelectedItem().equals("Clientes")) {
					node.makeTransition("/fxml/ClientFrame.fxml", mainPane);
				}
				if (menuList.getSelectionModel().getSelectedItem().equals("Ventas")) {
					node.makeTransition("/fxml/SalesFrame.fxml", mainPane);
				}
				if (menuList.getSelectionModel().getSelectedItem().equals("Movimientos")) {
					node.makeTransition("/fxml/TransactionFrame.fxml", mainPane);
				}
			}
		});
	}

	public void mainMenu() {
		Parent root = node.setRoot("/fxml/MainFrame.fxml");
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setTitle("Menu Principal");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

}
