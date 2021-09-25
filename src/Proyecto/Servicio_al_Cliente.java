package Proyecto;

public class Servicio_al_Cliente implements Manipulador {

	private Manipulador siguiente;
	
	public Servicio_al_Cliente(Manipulador siguiente) {
		
		this.siguiente = siguiente;
	}
	 
	@Override
	public double CalcularCredito(double cantidad) {
		// TODO Esbozo de método generado automáticamente
		
		if (cantidad >25000) {
			System.out.println("SAC. no pudo solucionarlo...");
			System.out.println("");
			return siguiente.CalcularCredito(cantidad); 
		}else {
			System.out.println("Se solucionó en el area de servicio al cliente");
			return cantidad;
			
		} 
	}

}
