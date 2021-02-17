package mates;
import aplicacion.*;

public class Matematicas {
	
	public static void calcularPi(int pasos) {
		double fuera = 0;
		double dentro = 0;
		
		for(int i =0 ; i<pasos ; i++) {
			
			double x = (double) (Math.random() * 2);
			double y = (double) (Math.random() * 2);
			
			System.out.println("Cordenada x del dardo " + i + " es: " + x);
			System.out.println("Cordenada y del dardo " + i + " es: " + y);
			
			if(x>1 && y>1) {
				fuera += 1;
				
			}else {
			
				dentro+= 1;
			}
			double pi = (4*dentro)/(1*(fuera+dentro));
			
			double total = (fuera+dentro);
			
			double porcentaje =(pi/Math.PI)*100;
			
			System.out.println("La aproximacion por el metodo de montecrlo con " + total + " dardos lanzados es de: " + pi);
			System.out.println("La aproximacion es del: " + porcentaje + "%");
			System.out.println("El numero de dardos que entraron dentro es de: "+ dentro);
			System.out.println("El numero de dardos que salieron del circulo es de: "+ fuera + "\n");
			
		}
		
		
		
	}
	
}
