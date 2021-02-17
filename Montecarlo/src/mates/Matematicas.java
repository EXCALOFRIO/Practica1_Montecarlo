package mates;

public class Matematicas {
	
	public static void calcularPi(int pasos) {
		double fuera = 0;
		double dentro = 0;
		double pi = 0;
		
		for(int i =0 ; i<pasos ; i++) {
			double x =  Math.random()*1;
			double y =  Math.random()*1;
			
			double porcentaje =(pi/Math.PI)*100;
			double porcentajeRed = Math.round(porcentaje*100.0)/100.0;
			
			pi = (4*dentro)/(1*(fuera+dentro));
			
			System.out.println("Pi: " + pi + " ====> " + porcentajeRed + "%");
			
			if(x*x+y*y <= 1) {
				
				dentro += 1;
				
			}else {
			
				fuera += 1;
			}
		}
		double total = (fuera+dentro);
		System.out.println( "\n" + "La aproximacion por el metodo de montecrlo con " + total + " dardos lanzados es de: " + pi);
		System.out.println("El numero de dardos que entraron dentro es de: "+ dentro);
		System.out.println("El numero de dardos que salieron del circulo es de: "+ fuera);
	}
}
