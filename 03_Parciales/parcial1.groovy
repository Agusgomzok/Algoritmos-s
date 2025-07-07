//
ACCION Stock ES
    AMBIENTE

        Fecha:Registro
            aa:Entero
            mm:1..12
            dd:1..31
        FinRegistro

        Stock:Registro
            Cod_Sucursal:Entero
            Rubro:AN(10)
            Cod_Art:Entero
            FechaUltRep:Fecha
            StockSegur:Entero
            StockActual:Entero
        FinRegistro

        Arch_Stock: Archivo ordenado por Cod_Sucursal, Rubro, Cod_Art
        Reg_Stock:Stock

        Resg1:Entero
        Resg2:AN(10)
        Resg3:Entero

        c1,c2,cT:Entero
        a1,a2,aT:Real
    
        SUBACCION Tratar_Corte_Sucursal ES
            

            //Reinicializar contadores y acumuladores
            c1,c2,cT := 0
            a1,a2,aT := 0
    PROCESO
        Abrir e/(Arch_Stock)
        Leer (Arch_Stock,Reg_Stock)
        c1,c2,cT := 0
        a1,a2,aT := 0

        resg1:=Reg_Stock.Cod_Art
        resg2:=Reg_Stock.Rubro
        resg3:=Reg_Stock.Cod_Sucursal

        Mientras NFDSA (Arch_Stock) HACER
            si Reg_Stock.Cod_Sucursal <> Resg3 entonces
                Tratar_Corte_Sucursal
            SINO
                si Reg_Stock.Rubro <> Resg2 entonces
                    Tratar_Corte_Rubro
                SINO
                            si Reg_Stock.Cod_Art <> Resg1 entonces//NO SE HACE CORTE POR CODIGO ARTICULO
                                Tratar_Corte_Articulo//MAL
                            FINSI
                FINSI//HASTA ACA BIEN
            FINSI
            Leer (Arch_Stock,Reg_Stock)
        FINMIENTRAS

FINACCION