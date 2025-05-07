//Escribir un programa que permita calcular el precio de un artículo para un año dado, considerando que la inflación es del 4 por 100 anual.
//La fórmula del precio es: P = C * (1 + R) ^ (N - A)

//C - Precio actual.
//N - Año futuro.
//R - Tasa de Inflación.
//A - Año actual.

Accion 1.1.5.2 es
	Ambiente
		C:Real
		N:Num
		R=0,04
		A:Num
		precio_Futuro:Real
	Proceso
	Escribir("Bueno dias")
	Escribir("este programa que permita calcular el precio de un artículo para un año dado, considerando que la inflación es del 4 por 100 anual.")
	Escribir("Ingrese precio del producto" C)
	Leer(C)
	Escribir("Ingrese año actual")
	Leer(A)
	Escribir("Ingrese año futuro")
	Leer(N)
	precio_Futuro:=C * (1 + R) ^ (N - A)
fin Accion