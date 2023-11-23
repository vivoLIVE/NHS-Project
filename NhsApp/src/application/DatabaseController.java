package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class DatabaseController {
	@FXML
    private TextField postcode1;

    @FXML
    private TextField postcode2;
    
    @FXML
    private Button btnResult;
    
    @FXML
    private Label resultLabel;
    
    @FXML
    public void initialize() {
        // Initialization code here
        System.out.println("DatabaseController initialized");

        // You can set default values or perform other tasks here
        postcode1.setText("0");
        postcode2.setText("0");
    }
    
    @FXML
    private void handleBtnResult() {
        // Get the current values from TextFields
        int value1 = Integer.parseInt(postcode1.getText());
        int value2 = Integer.parseInt(postcode2.getText());

        // Increment the values
        value1++;
        value2++;

        // Update TextFields with the new values
        postcode1.setText(Integer.toString(value1));
        postcode2.setText(Integer.toString(value2));

        // Update the resultLabel with the sum of values
        int result = value1 + value2;
        resultLabel.setText("Result: " + result);
    }
}
