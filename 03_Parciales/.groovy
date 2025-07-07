Acion ejercicio_26 es  
    Ambiente
    s1, s2: secuencia de caracter
    letras: caracter
    econtar_pal: logico
    posicion: entero
    Proceso
    rr(s1)
    arr(s2)
    Avz(s1, v1)
    abz(s2, v2)
    Crear(SAL)

    econtar_pal := Falso

    Mientras no FDS (S2) y No econtar_pal hacer
        Mientras v2= ' ' hacer
            Avz(s2, v2)
        FinMientras
        posicion := posicion + 1
        
        Si posicion MOD 2 = 0 Entonces
            //tratar palabra que cumple
        Sino
            //tratar palabra que no cumple
        Finsi
    
