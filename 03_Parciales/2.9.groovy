ACCION 2.9 ES
    AMBIENTE
        
        Productos:Registro
            Cod_Productos:Entero
            Tipo:("1","2","3")
            Marca:AN(10)
            Modelo:AN(10)
            Descripcion:AN(20)
            CantidadExistentes:Entero
            PrecioUnitario:Real
        FinReg


            Arch_Productos:Archivo ordenado por codigo de producto 
            Reg_Productos:Productos
            
            Arch_Salida:Archivo ordenado por codigo de producto
            Reg_Salida:Productos

    PROCESO
        Abrir E/ (Arch_Productos)
        Leer (Arch_Productos,Reg_Productos)
        Abrir /S (Arch_Salida)


        Mientras NFDSA (Arch_Productos)
        
            Segun Reg_Productos.Tipo HACER
            ´1´:


FINACCION