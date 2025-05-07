//7. Se desea obtener una tabla con 5 valores de e**X, usando para ello la siguiente fórmula:ex= 1 - x/1 ! + x2/2 ! - x3/3 ! + . . . . . .+ x20 /20 !
Accion Retorno es
	Ambiente
		ValorX:Real;//variable de entrada
	Proceso
		repetir 5 veces Hacer;//repite 5 veces
			Escribir("Ingrese el valor de x: ");//solicita el número
			Leer(ValorX);//lee el número
			Escribir("El valor de e**",ValorX," es: ",exp(ValorX));//retorna el valor de e^x
		Fin repetir;
	
fin Accion