package Proyecto;

public class Asesor_de_Creditos implements Manipulador {
	
	private Manipulador siguiente;
	
	public Asesor_de_Creditos(Manipulador siguiente) {
		
		this.siguiente = siguiente;
	}
	 
	@Override
	public double CalcularCredito(double cantidad) {
		// TODO Esbozo de método generado automáticamente
		
		if (cantidad >50000) {
			System.out.println("ADC. no pudo solucionarlo...");
			System.out.println("");
			return siguiente.CalcularCredito(cantidad);
		}else {
			
			System.out.println("Se solucionó en el area de Asesor de creditos");
			return cantidad; 
		} 
	}

}
