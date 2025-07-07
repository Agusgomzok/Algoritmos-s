//Dada una secuencia de letras del alfabeto que finaliza con la letra "Z", contar cuantas consonantes hay en la secuencia.
Accion Contar consonantes es
	Ambiente
		Vocal:("a", "e", "i", "o", "u")
		secuencia: secuencia de caracter
		V:caracter
		Contador: entero
	Proceso
		ARRANCAR (secuencia)
		Contador:=0
		Repetir
			AVANZAR (secuencia, V)
			si V no en Vocal entoces(y no en)
				Contador:= Contador + 1
			FinSi
		hasta que 	V="Z"

		Escribir "La cantidad de consonantes es: ", Contador
		CERRAR (secuencia)
		

FinAccion