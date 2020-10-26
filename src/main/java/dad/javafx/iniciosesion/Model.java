package dad.javafx.iniciosesion;

import java.util.HashMap;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty usuario = new SimpleStringProperty();
	private StringProperty contraseña = new SimpleStringProperty();
	private HashMap<String, String> datosMap;
	
	public Model(HashMap<String, String> datos) {
		this.datosMap = datos;  
	}
	
	public HashMap<String, String> getDatosMap() {
		return datosMap;
	}
	
	public void setDatosMap(HashMap<String, String> datos) {
		this.datosMap = datos;
	}
	
	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	
	public final StringProperty contraseñaProperty() {
		return this.contraseña;
	}
	
	public final String getContraseña() {
		return this.contraseñaProperty().get();
	}
	
	public final void setContraseña(final String contraseña) {
		this.contraseñaProperty().set(contraseña);
	}
	
	
	
}
