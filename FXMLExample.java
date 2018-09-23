package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLExample {

	public void start(Stage stage) throws Exception {
		Parent root  = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
		Scene scene = new Scene(root, 300, 275);
		stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();
	}
}
