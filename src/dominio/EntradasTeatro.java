package dominio;

public class EntradasTeatro extends Entradas{
	
	//Atributos
	private Genero genero;
	private Actores actor;
	
	//Constructores
	public EntradasTeatro(Genero genero, Actores actor) {
		super();
		this.genero = genero;
		this.actor = actor;
	}

	//Getters and setters
	public EntradasTeatro(int numEntrada, String nombreShow, String fechaEvento, String horaEvento,
			String tiempoDuracion, double costo, Genero genero, Actores actor) {
		super(numEntrada, nombreShow, fechaEvento, horaEvento, tiempoDuracion, costo);
		this.genero = genero;
		this.actor = actor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Actores getActor() {
		return actor;
	}

	public void setActor(Actores actor) {
		this.actor = actor;
	}

	 //Método toString
	@Override
	public String toString() {
		return super.toString() + " \nEntradasTeatro [genero=" + genero + ", actor=" + actor + "]";
	}
	
}