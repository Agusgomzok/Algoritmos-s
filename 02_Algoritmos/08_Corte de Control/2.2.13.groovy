//Un Casino de la región ha notado un incremento en los costos de las reparaciones de tragamonedas en sus sucursales. Por ello solicitó un informe con la cantidad de reparaciones y sus costos, discriminados según tragamonedas, modelo, marca, sucursal y total general.Se dispone de un archivo REPARACIONES, con el siguiente formato. Cada registro representa la reparación de un tragamonedas, tener en cuenta que puede existir más de una reparación por tragamonedas.
//REPARACIONES Ordenado por Cod_Sucursal, Marca, Modelo, Cod_Tragamonedas

ACCION 2.2.13 ES
    AMBIENTE
        
        FECHA:REGISTRO
            aa:Entero
            mm:1..12
            dd:1..31
        FINREGISTRO

        REPARACIONES:Registro
            Cod_Sucursal:Entero
            Marca:AN(10)
            Modelo:AN(10)
            Cod_Tragamonedas:Entero
            Fecha_Reparacion:FECHA
            costoReparacion:Real
        FINREGISTRO
        Arch_Reparaciones:Archivo ordenado por Cod_Sucursal, Marca, Modelo, Cod_Tragamonedas
        Reg_Reparaciones:REPARACIONES

        Resg1:Entero
        resg2:AN(10)
        resg3:AN(10)
        resg4:Entero
        
        C1,C2,C3,C4,CT:Entero
        A1,A2,A3,A4,AT:Real
    PROCESO
    Abrir e/(Arch_Reparaciones)
    Leer(Arch_Reparaciones,Reg_Reparaciones)
    Incializar contadores y acuuladores...

    resg1:=Reg_Reparaciones.Cod_Tragamonedas
    resg2:=Reg_Reparaciones.Modelo
    resg3:=Reg_Reparaciones.Marca
    resg4:=Reg_Reparaciones.Cod_Sucursal

    Mientras NFDSA (Arch_Reparaciones) HACER
        Si Reg.Reg_Reparaciones.Cod_Sucursal <> Resg4 entonces
            Tratar_Corte_Suc
        SINO
            si reg.marca <> Resg3 entonces
                Tratar_Corte_Marca
                SINO
                    si reg.modelo <> Resg2 entonces
                        Tratar_Corte_Modelo
                    SINO
                    si reg.Cod_Tragamonedas <> Resg1 entonces
                        Tratar_Corte_Tragamonedas  
                    FINSI
            FINSI
        Leer(Arch_Reparaciones,Reg_Reparaciones)
FINACCION