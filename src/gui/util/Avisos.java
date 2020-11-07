package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Avisos {
	public static void Alerta(String cabecalho,String titulo,String conteudo,AlertType alerta) {
		Alert alert = new Alert(alerta);
		alert.setHeaderText(cabecalho);
		alert.setContentText(conteudo);
		alert.setTitle(titulo);
		alert.show();
	}

}
