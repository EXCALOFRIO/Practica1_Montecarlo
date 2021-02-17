# README #
*23/11/2020 - 16/12/2020*  

![Copyrith](Copyrith.png)
>Copyright [2020] (Alejandro Ramirez Larena, Javier Martinez Cristobal, Pablo Rivero Dominguez, Joaquin Moreno Guzman copyright)
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.  

**Trabajo Programacion I**

### Proyecto final primera entrega ###

-El programa crea un catalogo, con elementos, en este caso zapatillas.  

-El programa se ejecuta con los siguientes comandos.

### Comandos para compilar y generar javadoc ###

-Para iniciar el programa hacer make run

-Si quieres realizar una demo del programa use el comando make demo

>Para compilar hay que usar desde la carpeta raiz make compilar  

>Para crear el .jar desde la carpeta raiz make jar  

>Para crear el java doc make javadoc  



### Como usar ###
-Para annadir un producto use el comando add. 

-Para annadir un producto use el comando addDeportiva.

-Para annadir un producto use el comando addCaye.

-Para eliminar un producto use el comando delete. 

-Para editar un producto use el comando editNormal si quiere que la nueva zapatilla sea de tipo normal. 

-Para editar un producto use el comando editDeportiva si quiere que la nueva zapatilla sea de tipo deportiva. 

-Para editar un producto use el comando editCaye si quiere que la nueva zapatilla sea de tipo caye. 

-Para ver el catalogo use el comando catalogo.  

-Para ver la ayuda use el comando help.  

-Para poder generar el CSV use el comando csv

### Comandos y ejemplos de uso ###
-De esta forma se annaden unas zapatillas java -jar catalogo.jar add Jordan Nike 42 

-De esta forma se annaden unas zapatillasDeportivas java -jar catalogo.jar addDeportivas Jordan Nike 42

-De esta forma se annaden unas zapatillasCaye java -jar catalogo.jar addCaye Jordan Nike 42 

-De esta forma se eliminan zapatillas java -jar catalogo.jar delete 1 

-De esta forma se editan zapatillas java -jar catalogo.jar editNormal 1 Jordan Nike 43 

-De esta forma se editan zapatillas java -jar catalogo.jar editDeportiva 1 Adidas Superstar 43 

-De esta forma se editan zapatillas java -jar catalogo.jar editCaye 1 Nautico SinCordones 43 

-De esta forma se ve el catalogo java -jar catalogo.jar catalogo   

-De esta forma se muestra la ayuda java -jar catalogo.jar help 

-De esta forma se genera el CSV java -jar catalogo.jar csv



### Realizado por:

Alejandro Ramirez Larena  

Javier Martinez Cristobal  

Pablo Rivero Dominguez

Joaquin Moreno Guzman  

### Diagrama UML###

-Este es el digrama creado con Umbrello de el programa.  

![Diagrama](diagramaFinal.png)
 

