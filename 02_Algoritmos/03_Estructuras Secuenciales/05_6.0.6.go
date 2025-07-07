// En una concesionaria de autos oficial de una marca venden 3 modelos diferentes, el gerente desea saber qué porcentaje del total disponible de cada modelo se vendió este mes. Escriba un algoritmo que ingrese los datos necesarios y muestre por pantalla el porcentaje vendido para cada modelo.
Accion Porcentaje_Concesionaria es
	Ambiente
		Gol:Real;//variable de entrada
		Corolla:Real;//variable de entrada
		Vento:Real;//variable de entrada
		Total:Real;//variable de salida
	Proceso
		Escribir("Este programa calcula el porcentaje de autos vendidos")
		Escribir("Ingrese la cantidad de autos Gol Vendidos:")
		Leer(Gol)
		Escribir("Ingrese la cantidad de autos Corolla Vendidos:")
		Leer(Corolla)
		Escribir("Ingrese la cantidad de autos Vento Vendidos:")
		Leer(Vento)
		Total:=Gol+Corrola+Vento
		Escribir("El porcentaje de autos Gol vendidos es:",(Gol/Total)*100,"%")
		
FinAccion
