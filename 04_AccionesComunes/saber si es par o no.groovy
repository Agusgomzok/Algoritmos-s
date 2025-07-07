//saber si es par
ACCION Saber_Si_Es_Par ES
    AMBIENTE
        n:Entero
    PROCESO
        Escribir("Ingrese un numero entero: ")
        Leer(n)
        Si n MOD 2 = 0 Entonces
            Escribir("El numero ", n, " es par.")
        Sino
            Escribir("El numero ", n, " es impar.")
        Finsi
    FINACCION
