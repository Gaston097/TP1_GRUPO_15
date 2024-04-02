package dominio;

public class EntradasInfantiles extends Entradas implements ICalcularCostos{
	
	//atributos

	private int edadNinio;
	private boolean souvenir;
	
	//constructores
	
	public EntradasInfantiles(int edadNinio, boolean souvenir) {
		super();
		this.edadNinio = edadNinio;
		this.souvenir = souvenir;
		CalcularCostoDeEntrada();
	}
	
	public EntradasInfantiles(int numEntrada, String nombreShow, String fechaEvento, String horaEvento,
			String tiempoDuracion, double costo, int edadNinio, boolean souvenir) {
		super(numEntrada, nombreShow, fechaEvento, horaEvento, tiempoDuracion);
		this.edadNinio = edadNinio;
		this.souvenir = souvenir;
		CalcularCostoDeEntrada();
	}
	
	//Getters and Setters
	
	public int getEdadNinio() {
		return edadNinio;
	}


	public void setEdadNinio(int edadNinio) {
		this.edadNinio = edadNinio;
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
		return super.toString() + "\n EntradasInfantiles [edadNinio = " + edadNinio + ", souvenir = " + souvenir  + "]";
	}
	
	//Abstracto
	public void CalcularCostoDeEntrada() {
		if(edadNinio < 8) {
			this.setCosto(250.0); 			
		}else {
			this.setCosto(500.0);
		}
	}
	

}
