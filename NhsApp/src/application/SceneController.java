package application;


import javafx.event.ActionEvent;
import java.io.IOException;

import database.DatabaseManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneController {
	private Stage stage;
	private Scene scene;
	private Pane pane;
	@FXML
	private Label myResultLabel;
	@FXML
	private TextField myPostcode1;
	@FXML
	private Button btnResult;
	
	@FXML
	public void search(ActionEvent event) {
	    try {
	        String input = myPostcode1.getText();
	        // Call a method to check the database for the entered postcode
	        DatabaseManager databaseManager = new DatabaseManager();  // Create an instance
	        if (databaseManager.checkPostcode(input)) {
	            myResultLabel.setText("Postcode found in the database");
	        } else {
	            myResultLabel.setText("Postcode not found in the database");
	        }
	    } catch (Exception e) {
	        myResultLabel.setText("Error");
	        e.printStackTrace();
	    }
	}
	
	
	
	
	
	public void switchToMain(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToGPsSearchScene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("GPsSearchScene.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
    
}
