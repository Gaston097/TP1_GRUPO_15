package dominio;

public class EntradasRecitales extends Entradas implements ICalcularCostos{
	private String tipoEntrada;
	private Banda bandaRecital;
	private Banda soporte;
	
	
	public EntradasRecitales(String tipoEntrada, Banda bandaRecital, Banda soporte) {
		super();
		this.tipoEntrada = tipoEntrada;
		this.bandaRecital = bandaRecital;
		this.soporte = soporte;
		CalcularCostoDeEntrada();
	}


	public EntradasRecitales(int numEntrada, String nombreShow, String fechaEvento, String horaEvento,
			String tiempoDuracion, double costo, String tipoEntrada, Banda bandaRecital, Banda soporte) {
		
		super(numEntrada, nombreShow, fechaEvento, horaEvento, tiempoDuracion);
		this.tipoEntrada = tipoEntrada;
		this.bandaRecital = bandaRecital;
		this.soporte = soporte;
		CalcularCostoDeEntrada();
	}


	public String getTipoEntrada() {
		return tipoEntrada;
	}


	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
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
		if(tipoEntrada == "vip") {
			this.setCosto(1500.0);
		}else {
			this.setCosto(800.0);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nEntradasRecitales [tipoEntrada=" + tipoEntrada + ", bandaRecital=" + bandaRecital + ", soporte="
				+ soporte + "]";
	}
	
	
	
	
}
