package Proyecto;

public class Gerente implements Manipulador{
	private Manipulador siguiente;
	
	public Gerente(Manipulador siguiente) {
		
		this.siguiente = siguiente;
	}
	
	@Override
	public double CalcularCredito(double cantidad) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		if (cantidad >100000) {
			System.out.println("Gerencia no pudo solucionarlo...");
			System.out.println("");
			return siguiente.CalcularCredito(cantidad);
		}else {
			
			System.out.println("Se solucion� en el area de Gerencia");
			return cantidad; 
		} 
	}
}
