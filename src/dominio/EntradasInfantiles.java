package dominio;
import java.time.LocalTime;
import java.time.LocalDate;

public class EntradasInfantiles extends Entradas implements ICalcularCostos{
	
	//atributos

	private int edad;
	private boolean souvenir;
	
	//constructores
	
	public EntradasInfantiles(int edad, boolean souvenir) {
		super();
		this.edad = edad;
		this.souvenir = souvenir;
		CalcularCostoDeEntrada();
	}
	
	public EntradasInfantiles(String nombreShow, LocalDate fechaEvento, LocalTime horaEvento,
			LocalTime tiempoDuracion, int edad, boolean souvenir) {
		super(nombreShow, fechaEvento, horaEvento, tiempoDuracion);
		this.edad = edad;
		this.souvenir = souvenir;
		CalcularCostoDeEntrada();
	}
	
	//Getters and Setters
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isSouvenir() {
		return souvenir;
	}


	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	
	//ToString
	@Override
	public String toString() {
		return super.toString() + "\n EntradasInfantiles [Edad = " + edad + ", Souvenir = " + souvenir  + "]";
	}
	
	//Retorna false si el evento todavia no ocurrió
		public boolean eventoYaOcurrio() {
			LocalDate fechaHoy = LocalDate.now();
			return !fechaHoy.isBefore(this.getFechaEvento()) && !!fechaHoy.isEqual(this.getFechaEvento());
		}
	
	//Abstracto
	public void CalcularCostoDeEntrada() {
		if(edad < 8) {
			this.setCosto(250.0); 			
		}else {
			this.setCosto(500.0);
		}
	}
	

}
