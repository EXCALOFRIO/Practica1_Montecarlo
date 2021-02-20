package mates;

public class Matematicas {
	
	public static void calcularPi(Integer pasos) {
		Double pi = 0.0;
		Double dentro = 0.0;
		Double fuera = 0.0;
		Double porcentaje = 0.0;
		for(int i =0 ; i<pasos ; i++) {
			
			Double distancia = (Math.pow((Math.random()*1), 2)) + (Math.pow((Math.random()*1), 2));
			
			if (distancia<=1) dentro++;
				else fuera++;
			
			porcentaje = Math.round(((pi/Math.PI)*100)*100.0)/100.0;
			Double total = dentro + fuera;
			pi = (4*dentro)/(1*(total));
			
			System.out.println("Pi: " + pi + " ====> " + porcentaje + "%");
		}
		System.out.println("\n" + "La aproximacion por el metodo de montecrlo con " + pasos + " dardos lanzados es de: " + pi +
				"\nUn " + porcentaje + "%" +
				"\nEl numero de dardos que entraron dentro es de: "+ dentro +
				"\nEl numero de dardos que salieron del circulo es de: "+ fuera);
	}
}
