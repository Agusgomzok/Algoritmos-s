ACCION 2.2 ES
    AMBIENTE
        Fecha:Registro
            Año:Entero
            Mes:1..12
            Dia:1..31
        FinRegistro
        Factura:Registro
            NroFactura:Entero
            Fecha_Factura:Fecha
            Total:Real
        FinRegistro

        Arch_Facturas:Archivo de Factura
        Reg_Factura: Factura
        Fecha_Usuario:Fecha//donde se va a almacenar la fecha que ingrese el usuario
    PROCESO
        Abrir E/ (Arch_Facturas)
        Leer(Arch_Facturas,Reg_Factura)

       //{
        Escribir("Ingresar una fecha de año, mes y dia")
        Leer:Fecha_Usuario.año
        Leer:Fecha_Usuario.mes
        Leer:Fecha_Usuario:dia
       //}
    
    //{ENTRA AL REGISTRO FACTURA Y VA CAMPO POR CAMPO
        Mientras NOFDSA (Arch_Facturas) HACER
            Si Reg_Factura.Fecha_Factura > Fecha_Usuario y Reg_Factura.Total < 1000 entonces
                Escribir(Reg_Factura.NroFactura,Reg_Factura.Fecha_Factura.año,Reg_Factura.Fecha_Factura.mes,Reg_Factura.Fecha_Factura.dia,Reg_Factura.Total)
            FinSi
    //}
            Leer(Arch_Facturas,Reg_Factura)
        Finmientras
        Cerrar(Arch_Facturas)
FINACCION