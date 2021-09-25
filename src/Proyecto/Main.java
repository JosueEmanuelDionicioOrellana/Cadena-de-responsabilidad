package Proyecto;



public class Main {

	public static void main(String[] args) {
		
		Superintendencia_de_Bancos acceso5 = new Superintendencia_de_Bancos();
		//acceso5 no debe sobrepasar lo que el banco no puede hacer 
		Banco_Central  acceso4 = new Banco_Central(acceso5);
		//acceso4 no debe sobrepasar los 500,000 
		Gerente acceso3 = new Gerente(acceso4);
		//acceso3 no debe sobrepasar los 100,000 
		Asesor_de_Creditos acceso2 = new Asesor_de_Creditos(acceso3);
		//acceso2 no debe sobrepasar los 50,000 
		Servicio_al_Cliente acceso1 = new Servicio_al_Cliente(acceso2);
		//acceso1 no debe sobrepasar los 25,000 
	
				
		//Solicitud
		System.out.println(acceso1.CalcularCredito(400000));
	
	}

}
