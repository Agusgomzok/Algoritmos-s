ACCION 2..2.3 ES

    AMBIENTE
        Alumno:Registro
            NroSocio:Entero
            NroTelefono:Entero
            ApellidoyNombre:AN(30)
            Carrera:("ISI","IEM","IQ","LAR")//PARENTESIS VA
            Domicilio:AN(10)
            CantidaddeUnidadesPrestadas:Entero
        FinReg
        Arch.Sal:Arch_Alumnos: Archivo de Alumno
        Arch_Alumnos: Archivo de Alumno
        Reg_Sal:Alumno
        Reg_Alumnos:Alumno
    PROCESO
        ABRIR E/ (Arch_Alumnos)
        Leer(Arch_Alumnos)
        Leer(Reg_Alumnos)
        Abrir /S (Arch_Sal)
        
        Mientras NOFDSA (Arch_Alumnos) HACER
            Si Reg_Alumnos.Carrera = "ISI" y Reg_Alumnos.CantidaddeUnidadesPrestadas > 4 entonces
                Reg_Sal:=Reg_Alumnos
                Escribir (Arch_Sal,Reg_Alumnos)
            FinSi
        Cerrar(Arch_Sal)
        Cerrar(Arch_Alumnos
        )
FINACCION