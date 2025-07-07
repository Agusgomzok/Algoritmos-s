//Del archivo general de alumnos de la U.T.N. - Facultad Regional Resistencia, ordenado por carrera, se desea emitir la cantidad de alumnos correspondientes a cada carrera y el total general.
ACCION 2.2.10 ES
    AMBIENTE
        alumnos:Registro
            carrera:("IEM", "ISI", "IQ")
            n_legajo:Entero
        FINREGISTRO
        arch_Alumnos: archivo ordenado por carrera
    PROCESO
FINACCION