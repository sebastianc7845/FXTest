package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
	@FXML
	private Label headingLabel;
	@FXML
	private TextField field;

	
	public void printText(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER && e.getSource().equals(field)) {
			System.out.println(field.getText());
			field.clear();
		}
	}
}
