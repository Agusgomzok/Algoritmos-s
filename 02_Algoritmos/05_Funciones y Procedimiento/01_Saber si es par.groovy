//Se ingresan 100 valores, te pedimos que informes cuantos numeros pares se hallan en esa serie ingresada.
ACCION Saber_Si_Es_Par ES
    AMBIENTE
        Es_Par:logico
        numero:Entero
        contadorPares:Entero

        Subaccion Tratar_Pares (numero:Entero):logico es
            SI numero MOD 2 = 0 ENTONCES
                Es_Par:= Verdadero
            SINO
                Es_Par:= Falso
            FINSI
        FinSubaccion

    PROCESO
        ContadorPares:= 0
        Para i desde 1 hasta 100 Hacer
            Escribir ("Ingrese el numero a evaluar: ")
            Leer (numero)
            Es_Par:= Tratar_Pares(numero)
            Si Es_Par Entonces
                ContadorPares := ContadorPares + 1
            Finsi
        FinPara
        Esciribir ("La cantidad de numeros pares ingresados es :", ContadorPares)
FINACCION