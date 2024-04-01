package dominio;

public class Principal {

	public static void main(String[] args) {
		// Prueba de clases

		Genero gen = new Genero("Rock", 1);
		
		System.out.println("ID genero: "+gen.getId()+" - Nombre: "+gen.getNombre());
		
	}

}
