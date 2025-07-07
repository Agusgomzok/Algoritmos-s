//Se dispone de una secuencia de números de DNI asignados a un circuito electoral, generar otra secuencia denúmeros que contenga los DNI múltiplos de 3.
Accion FiltrarDNI es
	Ambiente
	Secuencia: secuencia de entero
	SecuenciaSalida: secuencia de entero
	V: entero
	Proceso
	ARRANCAR (Secuencia)
	AVANZAR (Secuencia, V)
	CREAR(SecuenciaSalida)
	Mientras NO FDS (Secuencia) hacer
	
FinAccion