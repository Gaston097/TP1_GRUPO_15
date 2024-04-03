package dominio;
import java.time.LocalTime;
import java.time.LocalDate;

public class EntradasDeportes extends Entradas implements ICalcularCostos {
	
	private TipoDeporte tipoDeporte;

	public EntradasDeportes(TipoDeporte tipoDeporte) {
		super();
		this.tipoDeporte = tipoDeporte;
		CalcularCostoDeEntrada();
	}

	public EntradasDeportes(String nombreShow, LocalDate fechaEvento, LocalTime horaEvento,
			LocalTime tiempoDuracion, TipoDeporte tipoDeporte) {
		super(nombreShow, fechaEvento, horaEvento, tiempoDuracion);
		this.tipoDeporte = tipoDeporte;
		CalcularCostoDeEntrada();
	}

	public TipoDeporte getTipoDeporte() {
		return tipoDeporte;
	}

	public void setTipoDeporte(TipoDeporte tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}


	@Override
	public void CalcularCostoDeEntrada() {
		double costoFijo;
		
		switch(tipoDeporte.getNombre().toLowerCase()) {
		case "futbol":
            costoFijo = 300.0;
            break;
        case "rugby":
            costoFijo = 450.0;
            break;
        case "hockey":
            costoFijo = 380.0;
            break;
        default:
            costoFijo = 0.0; 
            break;
		}
		
		if (tipoDeporte.isInternacional()) {
	        costoFijo *= 1.3; // Aplica recargo del 30%
	    }
		
		setCosto(costoFijo);
		
	}
	
	//Retorna false si el evento todavia no ocurrió
	public boolean eventoYaOcurrio() {
		LocalDate fechaHoy = LocalDate.now();
		return !fechaHoy.isBefore(this.getFechaEvento()) && !!fechaHoy.isEqual(this.getFechaEvento());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n EntradasDeportes [Tipo de deporte = " + tipoDeporte + "]";
	}
	
}
