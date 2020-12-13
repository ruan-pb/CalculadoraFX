package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Avisos;
import gui.util.Regras;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField text01;
	@FXML
	private TextField text02;
	@FXML
	private Button somar;
	@FXML
	private Button subtrair;
	@FXML
	private Button multiplicar;
	@FXML
	private Button dividir;

	@FXML
	private Label resultado;

	public void onBtSomaAction() {
		try {
			Locale.setDefault(Locale.US);

			double valor1 = Double.parseDouble(text01.getText());
			double valor2 = Double.parseDouble(text02.getText());
			double soma = valor1 + valor2;
			resultado.setText(String.format("%.2f", soma));
			Clean();

		} catch (NumberFormatException e) {
			Avisos.Alerta("Aviso", "Erro de sintaxe", "Apenas numeros são válidos", Alert.AlertType.ERROR);
		}
	}
	private void Clean() {
		text01.setText("");
		text02.setText("");
	}

	public void onBtSubtrairAction() {
		try {
			Locale.setDefault(Locale.US);

			double valor1 = Double.parseDouble(text01.getText());
			double valor2 = Double.parseDouble(text02.getText());
			double subtracao = valor1 - valor2;
			resultado.setText(String.format("%.2f", subtracao));
			Clean();

		} catch (NumberFormatException e) {
			Avisos.Alerta("Aviso", "Erro de sintaxe", "Apenas numeros são válidos na calculadora", Alert.AlertType.ERROR);
		}
	}

	public void onBtMultiplicacaoAction() {
		try {
			Locale.setDefault(Locale.US);

			double valor1 = Double.parseDouble(text01.getText());
			double valor2 = Double.parseDouble(text02.getText());
			double multiplicacao = valor1 * valor2;
			resultado.setText(String.format("%.2f", multiplicacao));
			Clean();
			

		} catch (NumberFormatException e) {
			Avisos.Alerta("Aviso", "Erro de sintaxe", "Apenas numeros são válidos", Alert.AlertType.ERROR);
		}

	}

	public void onBtDivisaoAction() {
		try {
		Locale.setDefault(Locale.US);
		
		double valor1 = Double.parseDouble(text01.getText());
		double valor2 = Double.parseDouble(text02.getText());
		if(valor1 == 0 || valor2 == 0) {
			Avisos.Alerta("Divisão Invalida", null, "Você tentou dividir um numero por zero, Operação não permitida", AlertType.ERROR);
			Clean();

			
		}
		else {
			double soma = valor1 / valor2;
			resultado.setText(String.format("%.2f", soma));
			Clean();
		}
	
		}
		catch(NumberFormatException e) {
			Avisos.Alerta("Aviso", "Erro de sintaxe", "Apenas numeros são válidos", Alert.AlertType.ERROR);
		}
	}

	// comando initialize serve para eecutar uma função antes de a função começa a
	// rodar

	public void initialize(URL arg0, ResourceBundle arg1) {
		// para ser somente numeros double, recusando String
		Regras.setTextFieldDouble(text01);
		Regras.setTextFieldDouble(text02);
		// Limite maximo de caracteres na campo
		Regras.setTextFieldMaxLength(text01, 12);
		Regras.setTextFieldMaxLength(text02, 12);


	}
	

}
