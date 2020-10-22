package dad.javafx.iniciosesion;

import javafx.application.Application;
import javafx.stage.Stage;

public class InicioSesion extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//Scene escena = new Scene(, 320, 200);

		Stage stage = new Stage();
		stage.setTitle("Hola Mundo Mejorado");
		//stage.setScene(escena);
		stage.show();
	}

}
