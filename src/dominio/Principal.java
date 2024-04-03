package dominio;

public class Principal {

	public static void main(String[] args) {
		// Prueba de clases

		Genero gen = new Genero("Rock", 1);
		Actores actor = new Actores(1, "Facundo", "Arana", 40);
		Entradas entrada1 = new EntradasTeatro(gen, actor);
		Entradas entrada2 = new EntradasTeatro(gen, actor);
		
		//System.out.println("ID genero: "+gen.getId()+" - Nombre: "+gen.getNombre());
		System.out.println(entrada1.toString());
		System.out.println(entrada2.toString());
		
		//
		
		//Entrada Infantil
		
		Entradas entrada3 = new EntradasInfantiles(10, true);
		System.out.println(entrada3.toString());
		
		//Entradas Deportes
		
		TipoDeporte tp = new TipoDeporte(1, "hockey", false);
		Entradas entrada4 = new EntradasDeportes(tp);
		
		TipoDeporte tp2 = new TipoDeporte(2, "futbol", true);
		Entradas entrada5 = new EntradasDeportes(tp2);
		
		System.out.println(entrada4.toString());
		System.out.println(entrada5.toString());
	}

}