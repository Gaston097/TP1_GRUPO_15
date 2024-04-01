package dominio;

public class Actores {
	
	//Atributos
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructor
	
	public Actores(int id, String nombre, String apellido, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

   //Método TOSTRING
	
	@Override
	public String toString() {
		return "Actores [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
}
