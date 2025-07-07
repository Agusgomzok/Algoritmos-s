//tema B
Accion ejercicioN1 Es
    Ambiente
        sal, sucursal: secuencia de caracter
        ticket: secuencia de enteros
        v1: caracter
        v2: enteros
        
        unidad, decena, centena: N(1)
        contef, i, canticket, totalticket, totalticket_efec: N(3)
        prom: real(2)
        
        Funcion ConvertiraNumero(x:caracter):enteros
        Finfuncion

        Funcion convertiraCaracter(x:entero):caracter
            Segun x hacer
                = 0 : "0"
                = 1 : "1"
                = 2 : "2"
                = 3 : "3"
                = 4 : "4"
                = 5 : "5"
                = 6 : "6"
                = 7 : "7"
                = 8 : "8"
                = 9 : "9"
            FinSegun
        Finfuncion

    Proceso
        Crear (sal)
        Arr(sucursal)
        Arr(ticket)
        Avz(sucursal, v1)
        Avz(ticket, v2)
        canticket, contef, totalticket, totalticket_efec:= 0

        Mientras NFDS(sucursal) hacer
            //escribo el nombre de la sucursal en la salida
            Si v1 <> & entonces
                Esc(sal, v1)
                Avz(sucursal, v1)
            Finsi

            //convierto el caracter a digito
            Para i:=1 hasta 4 entonces
                Si i=2 entonces
                    canticket := ConvertiraNumero(v1)*100
                Sino
                    Si i=3 entonces
                        canticket := canticket + ConvertiraNumero(v1)*10
                    Sino
                        Si i=4 entonces 
                        canticket := canticket + ConvertiraNumero(v1)
                    Finsi
                Finsi
                Avz(sucursal, v1)
            FinPara
            totalticket:= canticket + totalticket
            
            //cuento los tickes en efectivo
            Mientras canticket <> 0 entonces
                Para i:=1 hasta 4 entonces
                    Si i = 1 y v2 = 1 entonces
                        contef := contef +1
                        totalticket_efec := totalticket_efec + 1
                    Finsi
                    Avz(ticket, v2)
                FinPara
                canticket:= canticket - 1
            Finmientras

            //convertir a caracter y escribir en secuencia
            unidad:= contef MOD 10
            contef:= contef DIV 10
            decena:= contef MOD 10
            centena:= contef DIV 10
            v1:= Funcion convertiraCaracter(centena)
            Esc(sal, v1)
            v1:= Funcion convertiraCaracter(decena)
            Esc(sal, v1)
            v1:= Funcion convertiraCaracter(unidad)
            Esc(sal, v1)
            contef := 0
        Finmientras
        prom:= (totalticket_efec*100) / totalticket
        Esc("el promedio de tickets en efectivo es de: ", prom, "%")
Finaccion









//Tema A               
Accion ejercicioN1 Es
    Ambiente
        sucursal: secuencia de caracter
        sal, ticket: secuencia de enteros
        v1: caracter
        v2: enteros
    
        canticket, i, mayor, nroticket, nroticket_mayor: N(6)

        Funcion ConvertiraNumero(x:caracter):enteros
        Finfuncion

    Proceso
        Arr(sucursal)
        Arr(ticket)
        Crear (sal)
        Avz(sucursal, v1)
        Avz(ticket, v2)
        canticket, mayor, nroticket, nroticket_mayor := 0
        Mientras NFDS(sucursal) hacer
            //muestro por pantalla la sucursal
            Si v1 <> & entonces
                Esc(v1)
                Avz(sucursal, v1)
            Finsi
            //convierto el caracter en digito
            Para i:=1 hasta 4 entonces
                Si i=2 entonces
                    canticket := ConvertiraNumero(v1)*100
                Sino
                    Si i=3 entonces
                        canticket := canticket + ConvertiraNumero(v1)*10
                    Sino
                        Si i=4 entonces 
                        canticket := canticket + ConvertiraNumero(v1)
                    Finsi
                Finsi
                Avz(sucursal, v1)
            FinPara
            //trato los tickets buscando el mayor valor
            Mientras canticket <> 0 entonces
                Para i:=1 hasta 4 entonces
                    Si i = 2 entonces
                        nroticket:= v2
                    Finsi
                    Si i = 4 y v2 > 50000 entonces
                        Esc(sal, nroticket)
                        Esc(sal, v2)
                        //mayor valor de la sucursal
                        Si v2 > mayor entonces
                            nroticket_mayor:= nroticket
                            mayor:= v2
                        Finsi
                    Finsi
                        Avz(ticket, v2)
                FinPara
                canticket:= canticket - 1
            Finmientras
            Esc("para esta sucursal el mayor valor fue: nro de ticket: ", nroticket_mayor, "importe: ", mayor)
        Finmientras
Finaccion
