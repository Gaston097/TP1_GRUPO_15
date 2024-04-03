package dominio;

public class EntradasDeportes extends Entradas implements ICalcularCostos {
	
	private TipoDeporte tipoDeporte;

	public EntradasDeportes(TipoDeporte tipoDeporte) {
		super();
		this.tipoDeporte = tipoDeporte;
		CalcularCostoDeEntrada();
	}

	public EntradasDeportes(int numEntrada, String nombreShow, String fechaEvento, String horaEvento,
			String tiempoDuracion, double costo, TipoDeporte tipoDeporte) {
		super(numEntrada, nombreShow, fechaEvento, horaEvento, tiempoDuracion);
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
	
	@Override
	public String toString() {
		return super.toString() + "\n EntradasDeportes [tipoDeporte=" + tipoDeporte + "]";
	}
	
}
