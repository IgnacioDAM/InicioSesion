package dad.javafx.iniciosesion;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox {

	private Label usuarioLabel;
	private Label contraseñaLabel;
	private Button accederButton;
	private Button cancelarButton;
	private TextField usuarioText;
	private PasswordField contraseñaPassword;

	public View() {
		super();

		usuarioLabel = new Label("Usuario: ");
		usuarioText = new TextField();
		usuarioText.setPromptText("Usuario");

		contraseñaLabel = new Label("Contraseña: ");
		contraseñaPassword = new PasswordField();
		contraseñaPassword.setPromptText("Contraseña");

		GridPane datosPane = new GridPane();
		datosPane.setHgap(2);
		datosPane.setVgap(2);
		datosPane.setAlignment(Pos.CENTER);
		datosPane.addRow(0, usuarioLabel, usuarioText);
		datosPane.addRow(1, contraseñaLabel, contraseñaPassword);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };

		datosPane.getColumnConstraints().setAll(cols);

		accederButton = new Button("Acceder");
		cancelarButton = new Button("Cancelar");

		HBox botones = new HBox(5, accederButton, cancelarButton);

		this.setSpacing(5);
		this.setFillWidth(false);
		this.getChildren().addAll(datosPane, botones);
		this.setAlignment(Pos.CENTER);
	}

	public void alertaDenegado() {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Iniciar sesión");
		alerta.setHeaderText("Acceso denegado");
		alerta.setContentText("El usuario y/o contraseña no son validos.");

		alerta.showAndWait();
	}

	public void alertaPermitido() {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Iniciar sesión");
		alerta.setHeaderText("Acceso permitido");
		alerta.setContentText("Las credenciales de acceso son válidas");

		alerta.showAndWait();
	}

	public Label getUsuarioLabel() {
		return usuarioLabel;
	}

	public Label getContraseñaLabel() {
		return contraseñaLabel;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getContraseñaPassword() {
		return contraseñaPassword;
	}

}
