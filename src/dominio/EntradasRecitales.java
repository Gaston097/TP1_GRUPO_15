package dominio;
import java.time.LocalTime;
import java.time.LocalDate;

public class EntradasRecitales extends Entradas implements ICalcularCostos{
	private boolean esVip;
	private Banda bandaRecital;
	private Banda soporte;
	
	
	public EntradasRecitales(String tipoEntrada, Banda bandaRecital, Banda soporte) {
		super();
		this.esVip = false;
		this.bandaRecital = bandaRecital;
		this.soporte = soporte;
		CalcularCostoDeEntrada();
	}


	public EntradasRecitales(String nombreShow, LocalDate fechaEvento, LocalTime horaEvento,
			LocalTime tiempoDuracion, boolean esVip, Banda bandaRecital, Banda soporte) {
		
		super(nombreShow, fechaEvento, horaEvento, tiempoDuracion);
		this.esVip = esVip;
		this.bandaRecital = bandaRecital;
		this.soporte = soporte;
		CalcularCostoDeEntrada();
	}


	public boolean getEsVip() {
		return esVip;
	}


	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}


	public Banda getBandaRecital() {
		return bandaRecital;
	}


	public void setBandaRecital(Banda bandaRecital) {
		this.bandaRecital = bandaRecital;
	}


	public Banda getSoporte() {
		return soporte;
	}


	public void setSoporte(Banda soporte) {
		this.soporte = soporte;
	}

	@Override
	public void CalcularCostoDeEntrada() {
		if(esVip) {
			this.setCosto(1500.0);
		}else {
			this.setCosto(800.0);
		}
	}
	
	//Retorna false si el evento todavia no ocurrió
		public boolean eventoYaOcurrio() {
			LocalDate fechaHoy = LocalDate.now();
			return !fechaHoy.isBefore(this.getFechaEvento()) && !!fechaHoy.isEqual(this.getFechaEvento());
		}

	@Override
	public String toString() {
		return super.toString() + "\nEntradasRecitales [Es VIP = " + esVip + ", Banda = " + bandaRecital + ", Banda soporte = "
				+ soporte + "]";
	}
	
	
	
	
}
