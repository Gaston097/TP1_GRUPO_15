package dominio;
import java.time.LocalTime;
import java.time.LocalDate;


public abstract class Entradas {
	
	//Atributos
	private int numEntrada;
	private final String nombreShow;
	private LocalDate fechaEvento;
	private LocalTime horaEvento;
	private LocalTime tiempoDuracion;
	private double costo;
	
	static int cont = 0;
	
	//Constructores
	
	public Entradas() {
		cont++;
		this.numEntrada = cont;
		this.nombreShow = "Predeterminado";
		this.fechaEvento = LocalDate.now();
		this.horaEvento = LocalTime.now();
		this.tiempoDuracion = LocalTime.now();
	}
	
	public Entradas(String nombreShow, LocalDate fechaEvento, LocalTime horaEvento, LocalTime tiempoDuracion) {
		cont++;
		this.numEntrada = cont;
		this.nombreShow = nombreShow;
		this.fechaEvento = fechaEvento;
		this.horaEvento = horaEvento;
		this.tiempoDuracion = tiempoDuracion;
	}
	
	//Getters and setters

	public int getNumEntrada() {
		return numEntrada;
	}

	public void setNumEntrada(int numEntrada) {
		this.numEntrada = numEntrada;
	}

	public String getNombreShow() {
		return nombreShow;
	}

//	public void setNombreShow(String nombreShow) {
//		this.nombreShow = nombreShow;
//	}

	public LocalDate getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public LocalTime getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(LocalTime horaEvento) {
		this.horaEvento = horaEvento;
	}

	public LocalTime getTiempoDuracion() {
		return tiempoDuracion;
	}

	public void setTiempoDuracion(LocalTime tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	 //Método toString
	
	@Override
	public String toString() {
		return "Entradas [Número de entrada = " + numEntrada + ", Nombre del show = " + nombreShow + ", Fecha = " + fechaEvento
				+ ", Hora = " + horaEvento + ", Duración = " + tiempoDuracion + ", Costo = " +"$"+ costo + "]";
	}
	
	//Método abstracto
	public abstract boolean eventoYaOcurrio();

}