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

{
//     Ejercicio N° 1 

// Un supermercado mayorista necesita un informe de ventas, para lo cual cuenta con una secuencia de caracteres y una secuencia de enteros, ambas contienen información del mes de JUNIO, para las distintas sucursales. La estructura de dichas secuencias es la siguiente:

// Secuencia de caracteres:
// Sucursal (cantidad indeterminada de caracteres) & cantidad de tickets (3 caracteres), sucursal & cantidad de tickets....FDS
// Ejemplo:
// Resistencia&025Barranqueras&123…FDS

// Secuencia de enteros
// Para cada ticket: Forma de pago (1: efectivo, 2: tarjeta débito y 3: tarjeta crédito) | Nro ticket | cantidad de artículos | importe
// Ejemplo:
// 1 | 2345 | 9 | 12500 | 3 | 2950 | 4 | 9864 |...FDS

// Si considera necesario, puede utilizar una función ConvertiraNumero(caracter), que recibe como parámetro un carácter y devuelve un dato entero. No es necesario desarrollar la función.

// Se solicita diseñar un algoritmo que:
// Genere una secuencia de salida de enteros que contenga el número de ticket y el importe, cuando el importe sea mayor a 50.000.
// Informe, para cada sucursal, cuál fue el ticket de mayor importe (y el importe).
}

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

{
//     Un supermercado mayorista que cuenta con un sistema de atención en cajas necesita un informe de ventas, para lo cual cuenta con el archivo secuencial VENTAS que contiene información de todos los tickets emitidos durante el mes de JUNIO. Para cada venta se registra:

// VENTAS, Ordenado por Nro de Caja, Forma de pago, Nro de ticket

// Nro de Caja
// Forma de pago
// (EF, TD y TC)
// Nro de ticket
// Fecha de venta
// Cantidad de artículos
// Importe de la venta


// Nota: EF: efectivo, TD: tarjeta débito y TC: tarjeta crédito.

// Se pide escribir un algoritmo que permita:

// Imprimir un informe del total de artículos vendidos por caja y por forma de pago.
// Crear un fichero de salida que contenga Nro de caja, total artículos que se pagaron en efectivo y total artículos que se pagaron con tarjetas (TD o TC). (1 registro por caja)

// Nro de Caja
// Total articulos
// Efectivo
// Total articulos Tarjetas


// Informar cuáles son las cajas que tuvieron mayor cantidad de artículos vendidos en efectivo que con tarjetas.

}
ACCION
    AMBIENTE
        Fecha:Registro
            aa:entero(4)
            mm:12
            dd:1..31
        FinRegistro

        Ventas:Registro
            NroCaja:Entero
            FormaPago:("EF","TD","TC")
            NroTicket:Entero
            FechaVenta:Fecha
        FinRegistro


    PROCESO
FINACCION