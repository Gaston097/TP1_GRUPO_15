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
		
	}

}