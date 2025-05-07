//Escribir una algoritmo que lea desde el teclado las unidades y el precio de un producto que se quiere comprar, y en función de las unidades introducidas calcule un descuento o no, según corresponda: cuando las unidades excedan media docena se aplicará 4% y el 10% cuando excedan la docena. La función debe devolver como resultado el valor del descuento o cero, en caso de que no corresponda.

Accion producto es
	Ambiente
		producto:Real;//variable de entrada
		unidades:Real;//variable de entrada
	Proceso
	para i:=1 hasta 10 Hacer;//repite 5 veces
		Escribir("Ingrese el precio del producto: ");//solicita el precio
		Leer(producto);//lee el precio
		Escribir("Ingrese la cantidad de unidades: ");//solicita la cantidad de unidades
		Leer(unidades);//lee la cantidad de unidades
		Si unidades > 6 Entonces;//si las unidades son mayores a 12
			descuento:= producto * 0.04;//calcula el descuento del 4%
		SiNo;//si las unidades son mayores a 12
			si unidades > 12 Entonces;//si las unidades son mayores a 12
				descuento:=producto * 0.10;
			fin si;//fin del ciclo
	fin para;//fin del ciclo
		Escribir("El descuento es: ",descuento);//retorna el descuento
Fin Accion


