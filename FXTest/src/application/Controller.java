package application;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

	
	public void printText(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER ) {
			TextField source = (TextField)e.getSource();
			System.out.println(source.getText());
			source.clear();
		}
	}
}
