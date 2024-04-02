package dominio;

public class EntradasTeatro extends Entradas implements ICalcularCostos{
	
	//Atributos
	private Genero genero;
	private Actores actor;
	
	//Constructores
	public EntradasTeatro(Genero genero, Actores actor) {
		super();
		this.genero = genero;
		this.actor = actor;
		CalcularCostoDeEntrada();
	}

	public EntradasTeatro(int numEntrada, String nombreShow, String fechaEvento, String horaEvento,
			String tiempoDuracion, double costo, Genero genero, Actores actor) {
		super(numEntrada, nombreShow, fechaEvento, horaEvento, tiempoDuracion);
		this.genero = genero;
		this.actor = actor;
		CalcularCostoDeEntrada();
	}

	//Getters and setters

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
	
	//Método abstracto
	public void CalcularCostoDeEntrada() {
		this.setCosto(1350.50); //Valor fijo 1350.50
	}
	 //Método toString
	@Override
	public String toString() {
		return super.toString() + " \nEntradasTeatro [genero=" + genero + ", actor=" + actor + "]";
	}
	
}