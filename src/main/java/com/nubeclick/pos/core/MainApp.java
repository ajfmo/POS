package com.nubeclick.pos.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication(scanBasePackages = { "com.nubeclick.pos" })
// @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
// HibernateJpaAutoConfiguration.class })
public class MainApp extends Application {

	private static final Logger log = LoggerFactory.getLogger(MainApp.class);

	public static void main(String[] args) throws Exception {

		SpringApplication.run(MainApp.class, args);
		// launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			log.info("Starting Hello JavaFX and Maven demonstration application");

			String fxmlFile = "/fxml/Main.fxml";
			log.debug("Loading FXML for main view from: {}", fxmlFile);
			FXMLLoader loader = new FXMLLoader();
			Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

			log.debug("Showing JFX scene");
			Scene scene = new Scene(rootNode);
			scene.getStylesheets().add("/styles/styles.css");

			stage.setTitle("NubeClick - Point of Sales");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
