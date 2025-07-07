//Realice una función que dado un número devuelva su cuadrado.
ACCION Calcular_Cuadrado ES
    AMBIENTE
        numero:Entero
        Resultado:Entero

        Función Calcular_Cuadrado(numero:Entero):Entero
            Resultado := numero ** 2
        FinFuncion
    PROCESO
        Escribir("Ingrese un numero entero:")
        Leer(numero)
        Resultado:= Calcular_Cuadrado(numero)
        Esciribir("El cueadrado de ", numero,"es:", Resultado)
FINACCION