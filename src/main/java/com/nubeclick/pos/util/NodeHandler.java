package com.nubeclick.pos.util;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class NodeHandler {

	private Parent root;

	public Parent setRoot(String url) {
		try {
			root = FXMLLoader.load(getClass().getResource(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return root;
	}

	private Node loadPane(String url, AnchorPane previousPane) {
		AnchorPane newPane = (AnchorPane) setRoot(url);
		previousPane.getChildren().clear();
		previousPane.getChildren().add(newPane);
		return newPane;
	}

	public void makeTransition(String url, AnchorPane previousPane) {
		FadeTransition transition = new FadeTransition(Duration.millis(1000), loadPane(url, previousPane));
		transition.setFromValue(0);
		transition.setToValue(1);
		transition.setCycleCount(1);
		transition.setAutoReverse(false);
		transition.play();
	}

	public void menuListTransition(String url, AnchorPane previousPane) {
		FadeTransition transition = new FadeTransition(Duration.millis(1500), loadPane(url, previousPane));
		transition.setFromValue(0);
		transition.setToValue(1);
		transition.setCycleCount(1);
		transition.setAutoReverse(false);
		transition.play();
	}
}
