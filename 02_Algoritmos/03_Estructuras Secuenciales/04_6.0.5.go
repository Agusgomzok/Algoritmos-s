//Se desea calcular el valor de la sección (S) de un conductor, la cual se determina en función de la corrienteeléctrica I y de la conductividad C del material (C=I/S). Además, a la sección así obtenida se le incrementa un 25% por razones de seguridad.
Accion Calcular_Seccion es
	Ambiente
		I:Real;
		C:Real;
		S:Real;
	Proceso
		Escribir("Este programa calcula la sección de un conductor")
		Escribir("Ingrese la corriente electrica: ");
		Leer(I);//lee la corriente electrica
		Escribir("Ingrese la conductividad del material: ");
		Leer(c)
		//lee la conductividad del material
		S:=I/C;//calcula la sección del conductor
		S:=S*0.25;//incrementa la sección en un 25%
		Escribir("La sección del conductor es:",S)//imprime la sección del conductor
FinAccion