// Ejercicio N° 1 

// Una cadena de hoteles necesita un informe de ocupación y pagos para el mes de JUNIO. Para esto, se cuenta con dos secuencias de datos:

// Secuencia de caracteres:
// Estructura: Hotel (cantidad indeterminada de caracteres) & cantidad de reservas (3 caracteres) hotel & cantidad de reservas....FDS

// Ejemplo: HotelAlas&340HotelBahia&999… FDS

// Secuencia de enteros:
// Estructura: Para cada reserva: Nro de reserva, tipo de habitación (1: single, 2: doble, 3: suite), cantidad de noches, importe.

// Ejemplo: 1234 | 1 | 3 | 120.000 | 2345 | 3 | 2 | 65.000 |...FDS

// Nota: La función ConvertiraNumero(caracter) puede ser utilizada si se considera necesario para convertir un carácter a un dato entero.

// Se pide escribir un algoritmo que permita:
// Generar una secuencia de salida de enteros que contenga el número de reserva y el importe, cuando el importe sea menor a 90.000.
// Informe, para cada hotel, cuál fue la reserva (NroReserva) con mayor cantidad de noches (y la cantidad de noches).

ACCION Hoteles ES
    AMBIENTE
        //secuencias
        Hotel:secuencia de caracter
        v:caracter
        reserva:secuencia de enteros
        j:entero
        sal:secuencia de enteros
        
        //contadores
        res_nro_mayor:entero
        nro_reserva:entero
        res_noche:entero
        total_reserva:entero
        

    PROCESO
        //arracancar secuencias
        arr(hotel)
        arr(reserva)
        crear(sal)

        //avanzar seucncias en 1ra digito
        avz(hotel,v)
        avz(reserva, j)

        Mientras NFDS(Hotel) HACER
            total_reserva:=0
            Mientras v <> & hacer
                esc(v)
                avz(hotel,v)
            Finmientras
            avz(hotel,v)

            Para i=1 hasta 3 hacer
                total_reserva:=total_reserva *10 + convertir_num (v)
                avz(hotel,v)
            FinPara

            nro_reserva:=0
            res_noche:=0
            res_nro_mayor:=0

            Para g=1 hasta total_reserva hacer
                nro_reserva:=j
                
                avz(reserva,j)
                avz(reserva,j)

                si j > res_noche entonces
                    res_nro_mayor:=nro_reserva
                    res_noche:=j
                finsi
                avz(sal,j)
            FinPara

            esc("la reserva"; res_nro_mayor; "fue la que mas noches tuvo con ";res_noche)
        FinMientras
        cerrar(hotel)
        cerrar(reserva)
        cerrar(sal)
FINACCION

// Ejercicio N° 2 

// La cadena de hoteles del ejercicio anterior cuenta con un sistema de gestión de reservas y ahora le solicita a Ud. un informe de ocupación y facturación para el mes de JUNIO. Para cada reserva se registra:

// RESERVAS, Ordenado por Número de Hotel, Tipo de Habitación, Número de Reserva

// Nro. de Hotel
// Tipo de Habitación
// (IND, DOB, SUITE)
// Nro de Reserva
// Fecha de ingreso
// Cantidad de noches
// Importe de la reserva


// Tipo de Habitación: (IND: Individual, DOB: Doble, SUITE: Suite)

// Se pide escribir un algoritmo que permita:
// Imprimir un informe que muestre el total de noches reservadas por hotel y por tipo de habitación.
// Crear un fichero de salida que contenga Número de Hotel, total de noches reservadas en habitaciones dobles y suites.

// Nro de Hotel
// Total hab. dobles
// Total hab. suites


// Informar cuáles son los hoteles que tuvieron mayor cantidad de noches reservadas en habitaciones dobles (DOB) que en suites (SUITE).


ACCION Corte_Control ES
    AMBIENTE
        Fecha:Registro
            aa:entero
            mm:1..12
            da:1..31
        FinRegistro

        Reserva:Registro
            nro_Hotel:n(10)
            tipo_hab:("ind","dob","suite")
            nro_reserva:(10)
            fecha_Ing:Fecha
            cant_noches:n(5)
            importe:Real
        FinRegistro

        arch: aechivo ordenado por nro-hotel, tipo_hab, nro_reserva
        resg:reservas
    PROCESO
FINACCION