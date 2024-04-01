package dominio;

public class TipoDeporte {
    private int id;
    private String Nombre;
    private boolean internacional;
    
    
   //Constructor
    public TipoDeporte(int id, String nombre, boolean internacional) {
		super();
		this.id = id;
		Nombre = nombre;
		this.internacional = internacional;
	}
    
    
	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public boolean isInternacional() {
		return internacional;
	}
	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

    //TOSTRING 
	@Override
	public String toString() {
		return "TipoDeporte [id=" + id + ", Nombre=" + Nombre + ", internacional=" + internacional + "]";
	}
    
    
    
    
}
