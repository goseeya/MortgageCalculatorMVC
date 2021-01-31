package application;
	
import application.view.MortgageCalculatorController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    ViewLoader<BorderPane, MortgageCalculatorController> viewLoader = new ViewLoader<>("view/MortgageCalculator.fxml");
			
			BorderPane sceneRoot = viewLoader.getLayout();
			MortgageCalculatorController mortgageCalculatorController = viewLoader.getController();
			mortgageCalculatorController.setMortgageCalculatorStage(primaryStage);

			Scene scene = new Scene(sceneRoot);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.setResizable(false);
			primaryStage.setTitle("MortgageCalculator");
			primaryStage.centerOnScreen();


			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
