package dominio;

public class Genero {

	//atributos
	private int id;
	private String nombre;
	
	// CONSTRUCTORES
	
	public Genero()
	{
		id=0;
		nombre = "Sin Género";
	}
	
	public Genero(String nombre, int id)
	{
		this.id= id;
		this.nombre= nombre;
	}
	
	// Getters y setters
	
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
	
	
	
	
	
}
