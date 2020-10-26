package dad.javafx.iniciosesion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.codec.digest.DigestUtils;

import javafx.application.Platform;

public class Controller {
	private View view = new View();
	private Model model;

	public Controller() {

		try {
			model = new Model(leerFichero("users.csv"));
		} catch (IOException e1) {
			Platform.exit();
		}

		// Binding
		model.usuarioProperty().bind(view.getUsuarioText().textProperty());
		model.contraseñaProperty().bind(view.getContraseñaPassword().textProperty());

		view.getCancelarButton().setOnAction(e -> Platform.exit());
		view.getAccederButton().setOnAction(e -> onAccederAction());
	}

	private void onAccederAction() {
		if (model.getDatosMap().containsKey(model.getUsuario())) {
			String md5 = DigestUtils.md5Hex(model.getContraseña()).toUpperCase();
			if (model.getDatosMap().get(model.getUsuario()).equals(md5))
				view.alertaPermitido();
			else
				view.alertaDenegado();
		}
	}
	
	public static HashMap<String, String> leerFichero(String nombre) throws IOException {
		HashMap<String, String> result = new HashMap<String, String>();
		FileReader fr = new FileReader(new File(nombre));
		BufferedReader br = new BufferedReader(fr);
		String[] actual;
		String line;

		while ((line = br.readLine()) != null) {
			actual = line.split(",");
			result.put(actual[0], actual[1]);
		}

		br.close();
		fr.close();

		return result;
	}

	
	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
}
