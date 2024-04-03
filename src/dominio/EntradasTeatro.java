package dominio;
import java.time.LocalTime;
import java.time.LocalDate;

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

	public EntradasTeatro(String nombreShow, LocalDate fechaEvento, LocalTime horaEvento,
			LocalTime tiempoDuracion, Genero genero, Actores actor) {
		super(nombreShow, fechaEvento, horaEvento, tiempoDuracion);
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
	
	//Retorna false si el evento todavia no ocurrió
		public boolean eventoYaOcurrio() {
			LocalDate fechaHoy = LocalDate.now();
			return !fechaHoy.isBefore(this.getFechaEvento());
		}
	
	 //Método toString
	@Override
	public String toString() {
		return super.toString() + " \nEntradasTeatro [Género = " + genero + ", Actor = " + actor + "]";
	}
	
}