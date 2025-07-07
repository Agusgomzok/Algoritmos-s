//Dado un número entero de tres cifras ingresado por el usuario, escriba un algoritmo que determine el valor de la centena, la decena y la unidad. Finalmente, muestre por pantalla los tres componentes por separado y el resultadode la suma de sus dígitos
Accion determinar es
	Ambiente
		numero:Entero
		centena:Entero
		decena:Entero
		unidad:Entero
		suma:Entero
	Proceso
	Escribir("este algoritmo determina el valor de la decena, sentena y unidad de un numero de 3 cifras")
	Escribir("ingrese un numero de 3 cifras")
	Leer(numero)
	centena:=numero div 100
	decena:=(numero mod 100) div 10
	unidad:=numero mod 10
	suma:=centena+decena+unidad
	Escribir("centena:",centena)
	Escribir("decena:",decena)
	Escribir("unidad:",unidad)
	Escribir("suma:",suma)
	Escribir("la suma de los digitos es:",suma)
fin Accion