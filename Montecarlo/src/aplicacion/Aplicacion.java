package aplicacion;
import mates.*;

public class Aplicacion {
	public static void main(String[] args){
		
		
		String entrada = args[0];
		int pasos=Integer.parseInt(entrada);
		Matematicas.calcularPi(pasos);
	}
}
