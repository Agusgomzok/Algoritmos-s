/*  Ejercicio 1
    Se acerca el Mundial de futbol de qatar 2022 y los organizadores desean conocer las estadisticas de reservas
    realizadas a cada uno de los estadios de futbol que seran sedes del torneo mundial durante la primera
    jornada de partidos.
    Para esto, se cuenta con informacion de todas las reservas realizadas a cada una de las plazas de los estadios
    en una secuencia de datos con la siguiente estructura:

    >>SECUENCIA NORMAL:
NombreEstadio%Capacidad#TipoReservaRazonSocial%AsientosReservados_TipoReservaRazonSocial%AsientosReservados_
@NombreEstadio%Capacidad#TipoReservaRazonSocial%AsientosReservados_TipoReservaRazonSocial%AsientosReservados_@...@FDS

    En donde:
        - NobreEstadio: cantidad de caracteres indefinida, indica el nombre del estadio.
        - Capacidad: dos caracteres que indican la capacidad de espectadores del estadio en miles de espectadores.
        - TipoReserva: 1 caracter que indica quien realiza la reserva, posibles valores:
            E: Empresa
            P: Particular
            Y: Protocolo
        - RazonSocial: el nombre de quien realiza la reserva.
        - AsientosReservados: cantidad de caracteres indefinida, tienendo en cuenta la siguiente estructura:
            3 caracteres en el formato CAA: donde C indica la zona (A..Z) y AA indica el numero de asiento (2 caracteres).
    
    Escribir un algoritmo que permita:
    1) Informar para cada estadio:
        a)La cantidad de reservas de cada tipo (Empresa, particular, protocolo)
        b)La cantidad de reservas realizadas en una zona en particular del estadio, ingresada por el usuario.
    2) Generar una secuencia de salida de enteros, donde cada elemento indicara la cantidad de reservas para cada
    estadio.
*/
ACCION Catar_Mundial ES
    AMBIENTE
        sec:secuencia de caracter
        v:caracter
        sal:secuencia de nteros
        s:caracter

        Contador_Reservas:Entero
        Contador_E:Entero
        Contador_P:Entero
        Contador_Y:Entero
        Contador_Zona:Entero
    PROCESO
        arrancar (sec)
        arrancar (sal)
        avanzar (sec, v)
        Contador_Reservas:= 0

        Mientras NFDS (sec) Hacer
            Mientras v = " "Hacer 
                avanzar (sec, v)
            FinMientras
        Contador_E:= 0
        Contador_P:= 0
        Contador_Y:= 0
        Contador_Zona:= 0

        Mientras v <> "@" Hacer
            Mientras v <> "%"
        FinMientras


FINACCION