package application;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {
	
	@FXML
	public Label result;
	private float num1=0;
	private float num2;
	private String operator="";
	private boolean checkStart=true;
	private Model model =new Model();
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if(checkStart) {
			result.setText("");
		    checkStart=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	
	@FXML
	public void processOperators(ActionEvent event) {
		String value=((Button)event.getSource()).getText();
		
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
			
			operator = value;
			num1=Long.parseLong(result.getText());
			result.setText("");
			return;
		}
		else {
			if(operator.isEmpty())
				return;
			num2 = Long.parseLong(result.getText());
			float output = model.calculate(num1, num2, operator);
			result.setText(String.valueOf(output));
			operator="";
			checkStart=true;
		}
	}
}
