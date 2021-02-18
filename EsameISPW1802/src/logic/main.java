package logic;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application{
	private Stage rootStage;
	private AnchorPane rootLayout;
	private BorderPane root;

	private calcolatrice controller;
	@Override
	public void start(Stage rootStage) {
		this.rootStage=rootStage;
		
		initRootLayout();
	
		this.rootStage.setTitle("calcolatrice");
	}
	
	private void initRootLayout(){
		FXMLLoader loader=new FXMLLoader();
		loader.setLocation(main.class.getResource("calcolatrice.fxml"));
		loader.setRoot(rootLayout);
		try {
			this.rootLayout=(AnchorPane) loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene=new Scene(rootLayout);
		rootStage.setScene(scene);
		this.rootStage.show();
		controller=loader.getController();	
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
