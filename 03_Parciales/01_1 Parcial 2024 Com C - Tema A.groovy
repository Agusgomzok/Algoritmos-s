// Ejercicio N° 1 

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

ACCION Ejercicio°1 ES
    AMBIENTE
        sucursal: secuencia de caracter
        ticket: seciencia de enteros
        salida:secuencia de enteros
        v1:caracter
        v2:entero

        canticket:entero
        nroticket:entero
        nroticket_mayor:entero    
    PROCESO
        Arr(sucursal)
        Arr(ticket)
        Crear(salida)
        Avz(sucursal, v1)
        Avz(ticket, v2)
FINACCION