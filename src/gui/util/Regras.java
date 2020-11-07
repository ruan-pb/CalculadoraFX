package gui.util;

import javafx.scene.control.TextField;

public class Regras {
	 public static void setTextFieldInteger(TextField txt) {
		 txt.textProperty().addListener((obs, oldValue, newValue) -> {
			 
			 //vai verircar se ha somente numero do tipo inteiro
			 if (newValue != null && !newValue.matches("\\d*")) {
				 //caso não tiver vai retorna o ultimo valor colocado
				 txt.setText(oldValue);
				 }
			 }
		 );
		 } 
	 
	 public static void setTextFieldMaxLength(TextField txt, int max) {
		 txt.textProperty().addListener((obs, oldValue, newValue) -> {
			 
			 //vai vericar a quantidade de elementos maximo no campo
			 //se a quantidade maxima de elementos for passada, ele retorna o ultimo numero
			 if (newValue != null && newValue.length() > max) {
				 txt.setText(oldValue);
				 }
			 }
		 );
		 } 
	 
	 public static void setTextFieldDouble(TextField txt) {
		 txt.textProperty().addListener((obs, oldValue, newValue) -> {
			 //vai verircar se h[a somente numero do tipo Double
			 if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				//caso não tiver vai retorna o ultimo valor colocado
				 txt.setText(oldValue);
				 }
			 }
		 );
		 }

}
