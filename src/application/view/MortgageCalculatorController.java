package application.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MortgageCalculatorController {

	@FXML
	private Button button;

	private Stage mortgageCalculatorStage;

	@FXML
	void initialize() {

	}

	@FXML
	void onButtonClick(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("This is alert title");
		alert.setContentText(button.getText());
		alert.show();
		mortgageCalculatorStage.close();

	}

	@FXML
	void onSomething(ActionEvent event) {

	}

	@FXML
	void onClose(ActionEvent event) {
		mortgageCalculatorStage.close();
	}

	public void setMortgageCalculatorStage(Stage mortgageCalculatorStage) {
		this.mortgageCalculatorStage = mortgageCalculatorStage;
	}

}