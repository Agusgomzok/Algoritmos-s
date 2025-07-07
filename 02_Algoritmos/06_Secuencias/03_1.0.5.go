//La secuencia de socios del problema anterior tiene el inconveniente de que los números están ordenados pero no son correlativos. Se desea generar una secuencia que contenga los números de socios que no figuran en la secuencia de socios.
Accion FiltrarSocios es
	Ambiente
		Secuencia: secuencia de entero
		SecuenciaSalida: secuencia de entero
		V: entero
		NumeroSocios: entero
		Proceso
		ARRANCAR (Secuencia)
		AVANZAR (Secuencia, V)
		CREAR(SecuenciaSalida)
		
		
		
		NumeroSocios:=0
		mientras NO FDS (Secuencia) hacer
			NumeroSocios:=NumeroSocios+1
			AVANZAR (Secuencia, V)
			Si V=NumeroSocios entonces
	FinAccion