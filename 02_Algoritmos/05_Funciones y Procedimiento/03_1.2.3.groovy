//Diseñe una función que devuelva la suma de los dígitos del número natural suministrado como parámetro.
ACCION
    AMBIENTE
        numero:Entero 
        acumSum:entero

        Función Sumar_digitos(numero:Entero):Entero
            acumSum := 0
            Para i = 0 hasta (numero DIV 10) > 0 Hacer
                acumSum := acumSum + (numero MOD 10)
                numero:= numero DIV 10
            FinPara

    PROCESO
        EScribir("ingrese un numero entero:")
        Leer(numero)
        acumSum:= Sumar_digitos(numero)
        Escribir("la suma de lo digistos del numero", numero, "es:";acumSum)
FINACCION