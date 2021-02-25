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
package aplicacion;
import mates.*;
/**
 * Clase Aplicacion que llama a generarPi e introduce los pasos (numero de dardos)
 * @author Alejandro Ramirez
 * @version 2.2, 22/02/2021
 */
public class Principal {
	/**
	 * Metodo que procesa la peticion de la sentencia
	 *@param  args entrada que establece el numero de dardos
	 */
	public static void main(String[] args){
		String entrada = args[0];
		long pasos = Long.parseLong(entrada);
		Matematicas.calcularPi(pasos);
	}
}