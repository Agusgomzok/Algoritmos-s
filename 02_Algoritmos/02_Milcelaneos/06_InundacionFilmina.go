//Como medida preventiva a las inundaciones en la ciudad, se debe realizar un algoritmo que diga si estamos ante una posible inundación o no. Para ello el usuario ingresará la cantidad en mm de agua, con este dato el sistema debería indicar: si es menor a 70 muestra por pantalla que no hay peligro, si es mayor o igual a 70 pero menor o igual a 100 es la condición poco peligro, en caso de ser mayor a 100 pero menor o igual a 150 es condición muy peligrosa, superando los 150 es inundación inminente.
Accion Inundacion Hacer
Ambiente
agua:Entero
Proceso
	Escribir("Este algoritmo dice si estamos ante una posible inundación o no")
	Segun agua Hacer
	<70: Escibir("No hay peligro")
	<100: Escibir("Poco peligro")
	<150: Escibir("mucho peigro")
	>150:Escibir("papi te va a entrar>><<°|")
Fin accion