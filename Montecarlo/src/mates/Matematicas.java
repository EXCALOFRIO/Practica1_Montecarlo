/*
Copyright [2020] [Alejandro Ramirez Larena copyright]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package mates;
/**
 * Clase Matematicas que tiene la funcion generarPi para generar PI
 * @author Alejandro Ramirez
 * @version 2.2, 22/02/2021
 */
public class Matematicas {
	/**
	 * Metodo que calcula PI 
	 *@param  pasos entrada que establece el numero de dardos
	 */
	public static void calcularPi(long pasos) {
		Double pi = 0.0, dentro = 0.0, fuera = 0.0, porcentaje = 0.0;
		
		for(int i =0 ; i<pasos ; i++) {
			
			Double distancia = (Math.pow((Math.random()*1), 2)) + (Math.pow((Math.random()*1), 2));
			
			if (distancia<=1) dentro++;
				else fuera++;
			
			//Uso Math.PI para calcular el porcentaje de acierto que tiene el codigo
			porcentaje = Math.round(((pi/Math.PI)*100)*100.0)/100.0;
			Double total = dentro + fuera;
			pi = (4*dentro)/(1*(total));
			
			//System.out.println("Pi: " + pi + " ====> " + porcentaje + "%");
		}
		System.out.println("\n" + "La aproximacion por el metodo de montecrlo con " + pasos + " dardos lanzados es de: " + pi +
				"\nUn " + porcentaje + "%" +
				"\nEl numero de dardos que entraron dentro es de: "+ dentro +
				"\nEl numero de dardos que salieron del circulo es de: "+ fuera);
	}
}
