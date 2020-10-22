package dad.javafx.iniciosesion;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
		usuarioText = new TextField("Usuario");

		HBox usuarioBox = new HBox(5, usuarioLabel, usuarioText);

		contraseñaLabel = new Label("Contraseña: ");
		contraseñaPassword = new PasswordField();

		HBox contraseñaBox = new HBox(5, contraseñaLabel, contraseñaPassword);

		accederButton = new Button("Acceder");
		cancelarButton = new Button("Cancelar");

		this.setSpacing(5);
		this.setFillWidth(false);
		this.getChildren().addAll(usuarioBox, contraseñaBox, accederButton, cancelarButton);
		this.setAlignment(Pos.CENTER);
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
