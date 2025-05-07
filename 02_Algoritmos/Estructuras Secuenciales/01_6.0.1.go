//Escribir un algoritmo que permita calcular el precio de un artículo para un año dado, considerando que lainflación es del 4 por 100 anual.La fórmula del precio es: P = C * (1+R) ^ (N - A)C - Precio actual. R - Tasa de Inflación.N - Año futuro. A - Año actual.
Accion calcularprecio es
	Ambiente
		C:Real
		R=0.04
		N:Entero
		A:Entero
		precio_Futuro:Real
	Proceso
	Escribir("Bueno dias")
	Escribir("este programa que permita calcular el precio de un artículo para un año dado, considerando que la inflación es del 4 por 100 anual.")
	Escribir("Ingrese precio del producto")
	Leer(C)
	Escribir("Ingrese año actual")
	Leer(A)
	Escribir("Ingrese año futuro")
	Leer(N)
	precio_Futuro:=C * (1 + R) ^ (N - A)
	Escribir("El precio futuro del producto va a ser:", precio_Futuro)
FinAccion