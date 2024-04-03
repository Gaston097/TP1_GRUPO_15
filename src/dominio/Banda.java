package dominio;

public class Banda {
	private String nombre;
	private Genero generoBanda;
	
	
	public Banda() {
		super();
		nombre = "sin nombre";
	}


	public Banda(String nombre, Genero generoBanda) {
		super();
		this.nombre = nombre;
		this.generoBanda = generoBanda;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Genero getGeneroBanda() {
		return generoBanda;
	}


	public void setGeneroBanda(Genero generoBanda) {
		this.generoBanda = generoBanda;
	}


	@Override
	public String toString() {
		return "Banda [nombre=" + nombre + ", generoBanda=" + generoBanda + "]";
	}
	
	
	
}
