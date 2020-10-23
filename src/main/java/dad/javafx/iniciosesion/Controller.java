package dad.javafx.iniciosesion;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	private View view = new View();
	private Model model = new Model();

	public Controller() {

		// model.nombreProperty().bind(view.getNombre().textProperty());
		view.getUsuarioText().textProperty().bind(model.usuarioProperty());
		view.getContraseñaPassword().textProperty().bind(model.contraseñaProperty());

		view.getAccederButton().setOnAction(e -> onAccederAction(e));

		// view.getCancelarButton().setOnAction(e -> onNombreAction(e));
	}
	
	private void alertaDenegado() {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Iniciar sesión");
		alerta.setHeaderText("Acceso denegado");
		alerta.setContentText("El usuario y/o contraseña no son validos.");

		alerta.showAndWait();
	}

	private void alertaPermitido() {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Iniciar sesión");
		alerta.setHeaderText("Acceso permitido");
		alerta.setContentText("Las credenciales de acceso son válidas");

		alerta.showAndWait();
	}
	
	private void onAccederAction(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
