//Elaborar un algoritmo que reciba un número entero y retorne -1 si el número es negativo.Si el número es positivo debe devolver una clave calculada de la siguiente manera: Se suma cada dígito que compone el número y a esa suma se le calcula el módulo 7.Por ejemplo: para la cifra 513, la clave será 5+1+3 =9; 9 mod 7 =2.Utilice la función para diseñar un algoritmo que permita leer varios valores y determine, para cada uno, si el número leído fue negativo o, si fue positivo, que clave le corresponde.

//542 div 10=54
//542 mod 10=2
//
Accion Retorno es
	Ambiente
		RecibirNumero:Entero;//variable de entrada
		acumSuma:Entero;//variable acumuladora

	Proceso
		Escribir("Ingrese un número entero: ");//solicita el número
		Leer(RecibirNumero);//lee el número
		acumSuma:= 0;//inicializa la variable acumuladora
		Si RecibirNumero < 0 Entonces;//si el número es negativo
			Escribir("El número es negativo, se retorna -1");//retorna -1
		SiNo;//si el número es positivo
			Mientras RecibirNumero > 0 Hacer;//mientras el número sea positivo
				acumSuma:= acumSuma + RecibirNumero mod 10; //suma de los dígitos
				RecibirNumero:= RecibirNumero div 10; //división entera para eliminar el último dígito
			Fin Mientras;//fin del ciclo
		Escribir("La clave es: ",acumSuma);//retorna la suma de los digitos
Fin Accion
