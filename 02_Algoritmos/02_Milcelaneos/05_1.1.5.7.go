//Escriba un algoritmo que halle la media geométrica de tres valores 
//X, Y, Z. Este debe emitir los tres valores por separado y luego el valor medio. La media geométrica es igual a (X×Y×Z)/3
accion 1.1.5.7 es
	Ambiente
		X:Real
		Y:Real
		Z:Real
		resultado:Real
	Proceso
		Escribir ("este algoritmo lo que hace es que halla la media geométrica de tres valores ")
			Escibir("ingrese el valor de x")
			Leer(x)
			Escibir("ingrese el valor de y")
			Leer(y)
			Escibir("ingrese el valor de z")
			Leer(z)
			resultado:=(X×Y×Z)/3
			Escribir("el resultado es", resultado)
Fin Accion