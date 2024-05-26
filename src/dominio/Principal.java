package dominio;
import java.time.LocalTime;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Prueba de clases
		//commit de prueba
		
		//Entrada teatro
		System.out.println("ENTRADAS TEATRO: \n");
		Genero gen1 = new Genero("Drama", 1);
		Genero gen2 = new Genero("Teatro", 2);
		Genero gen3 = new Genero("Comedia", 3);
		Actores actor1 = new Actores(1, "Ricardo", "Darín", 40);
		Actores actor2 = new Actores(2, "Facundo", "Arana", 40);
		Actores actor3 = new Actores(3, "Guillermo", "Francella", 60);
		Entradas entrada1 = new EntradasTeatro("9 Reinas", LocalDate.of(2024, 10, 31), LocalTime.of(16, 00, 00), LocalTime.of(02, 30, 00), gen2, actor2);
		Entradas entrada2 = new EntradasTeatro("El fantasma de la opera", LocalDate.of(2024, 5, 31), LocalTime.of(13, 00, 00), LocalTime.of(02, 00, 00), gen2, actor2);
		Entradas entrada3 = new EntradasTeatro("Casados con hijos", LocalDate.of(2024, 12, 31), LocalTime.of(20, 00, 00), LocalTime.of(02, 30, 00), gen1, actor1);
		System.out.println(entrada1.toString());
		System.out.println(entrada2.toString());
		System.out.println(entrada3.toString());
		System.out.println("\n");
		
		//Ejemplo de método abstracto
		System.out.println(entrada2.eventoYaOcurrio());
		
		
		//Entradas Infantiles
		System.out.println("ENTRADAS INFANTILES: \n");
		Entradas entrada4 = new EntradasInfantiles("Piñon fijo", LocalDate.of(2024, 6, 15), LocalTime.of(14, 00, 00), LocalTime.of(02, 30, 00), 30, false);
		Entradas entrada5 = new EntradasInfantiles("Topo Yiyo", LocalDate.of(2024, 12, 31), LocalTime.of(17, 00, 00), LocalTime.of(02, 30, 00), 5, true);
		System.out.println(entrada4.toString());
		System.out.println(entrada5.toString());
		System.out.println("\n");

		//Entradas Deportes
		System.out.println("ENTRADAS DEPORTES: \n");
		TipoDeporte tp1 = new TipoDeporte(1, "hockey", false);
		TipoDeporte tp2 = new TipoDeporte(2, "futbol", true);
		TipoDeporte tp3 = new TipoDeporte(3, "rugby", false);
		Entradas entrada6 = new EntradasDeportes("Mundial de Hockey", LocalDate.of(2024, 3, 3), LocalTime.of(17, 00, 00), LocalTime.of(02, 30, 00), tp1);
		Entradas entrada7 = new EntradasDeportes("Copa Libertadores", LocalDate.of(2024, 5, 4), LocalTime.of(18, 00, 00), LocalTime.of(02, 30, 00), tp2);
		Entradas entrada8 = new EntradasDeportes("Six Nations", LocalDate.of(2024, 11, 11), LocalTime.of(17, 30, 00), LocalTime.of(02, 30, 00), tp3);
		System.out.println(entrada6.toString());
		System.out.println(entrada7.toString());
		System.out.println(entrada8.toString());
		System.out.println("\n");
		
		//Entradas Recitales 
		System.out.println("ENTRADAS RECITALES: \n");
		Genero genero1 = new Genero("pop", 3);
		Genero genero2 = new Genero("rock", 4);
		Banda banda1 = new Banda("MaroonV", genero1);
		Banda banda2 = new Banda("AC/DC", genero2);
		Banda bsoporte1 = new Banda("El Kuelgue", genero1);
		Banda bsoporte2 = new Banda("Airbag", genero2);
		Entradas entrada9 = new EntradasRecitales("Maroon V en Velez", LocalDate.of(2024, 2, 1), LocalTime.of(18, 00, 00), LocalTime.of(02, 30, 00), false, banda1, bsoporte1);
		Entradas entrada10 = new EntradasRecitales("AC/DC en River", LocalDate.of(2024, 11, 11), LocalTime.of(21, 30, 00), LocalTime.of(02, 30, 00), true, banda2, bsoporte2);
		System.out.println(entrada9.toString());
		System.out.println(entrada10.toString());
		System.out.println("\n");
		
	}

}