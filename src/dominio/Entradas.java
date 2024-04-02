package dominio;

public class Entradas {
	
	//Atributos
	private int numEntrada;
	private String nombreShow;
	private String fechaEvento;
	private String horaEvento;
	private String tiempoDuracion;
	private double costo;
	
	//Constructores
	
	public Entradas() {
		this.numEntrada = 123456;
		this.nombreShow = "Nombre Show";
		this.fechaEvento = "fechaEvento";
		this.horaEvento = "horaEvento";
		this.tiempoDuracion = "tiempoDuracion";
	}
	
	public Entradas(int numEntrada, String nombreShow, String fechaEvento, String horaEvento, String tiempoDuracion) {
		super();
		this.numEntrada = numEntrada;
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

	public void setNombreShow(String nombreShow) {
		this.nombreShow = nombreShow;
	}

	public String getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}

	public String getTiempoDuracion() {
		return tiempoDuracion;
	}

	public void setTiempoDuracion(String tiempoDuracion) {
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
		return "Entradas [numEntrada = " + numEntrada + ", nombreShow = " + nombreShow + ", fechaEvento = " + fechaEvento
				+ ", horaEvento = " + horaEvento + ", tiempoDuracion = " + tiempoDuracion + ", costo = " + costo + "]";
	}

}