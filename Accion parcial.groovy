Accion parcial_D_tema_A es 
  ambiente 
      hotel:secuencia de caracter
      v : caracter
      sal;reserva:secuencia de enteros
      j: entero 
      res_nro_mayor;res_noche;nro_reserva;total_reserva:entero

 proceso
  arr(hotel)
  arr(reserva)
  crear(sal)
  avz(hotel,v)
  avz(reserva,j)

    Mientras NFDS(hotel) ha=cer 
       total_reserva:= 0
       Mientras v <> & hacer 
          esc (v)
          avz(hotel,v)
       Finmentras
       avz(hotel,v)
       Para i=1 hasta 3 hacer 
         total_reserva:= total_reserva * 10 + convertir_num (v)
         avz(hotel,v)
       FinPara
       
       nro_reserva:= 0
       res_noche:= 0
       res_nro_mayor:= 0

       Para g=1 hasta total_reserva hacer 
         nro_reserva:= j
         avz(reserva,j)
         avz(reserva,j)
          Si j > res_noche entonces 
             res_nro_mayor:= nro_reserva
             res_noche:= j
          FinSi
          avz(reserva,j)
           Si j < 90000 entonces 
             esc(sal,nro_reserva)
             esc(sal,j)
           FinSi
          avz(sal,j)
       FinPara
       
       esc("la reserva";res_nro_mayor;"fue la que mas noches tuvo con";res_noche)
    Finmentras           
  cerrar(hotel)
  cerrar(reserva)
  cerrar(sal)

FinAccion

Accion cadena_corte es
 ambiente
   fecha=registro
     aa:n(4)
     mm:n(2)
     da:n(2)
   Finregistro
   Reservas= registro
     nro_hotel:n(10)
     tipo_hab:{ind,dob,suite}
     nro_reserva:n(10)
     fecha_ing:fecha
     cant_noches:n(4)
     Importe:real
   Finregistro
   
   Arch: archivo ordenado por nro_hotel,tipo_hab y nro_reserva
   reg:reservas 
   
   Procedimiento mayor ( ) es 
       Si cont_dob > cont_suite entonces 
         esc("el hotel";res_nro_hotel;"tuvimos dobles reservas que suite")
       FinSi
   FinProcedimiento

   Procedimiento corte_tipo_hab (  ) es 
      esc("")
      total_noche_hotel:total_noche_hotel + acum_tipo_hab
      acum_tipo_hab := 0 
      res_tipo_hab:= reg.tipo_hab
   FinProcedimientos
   
   Procedimiento corte_nro_hotel ( ) es 
     esc("")
     sal.nro_hotel:= res_nro_hotel
     sal.totalhab_dob:= cant_do
     sal.totalhab_suite:= cant_suite
     grabar(tipos,sal)
     total_noche_hotel:= 0 
     cant_dob:= 0
     cant_dob:= 0
     res_nro_hotel:= reg.nro_hotel
   Procedimiento
   
   res_nro_hotel:n(10)
   res_tipo_hab:{ind,dob,suite}
   cant_dob;cant_suite;total_noche_hotel;acum_tipo_hab:entero 

 Proceso
  abrir()
  leer()
  abrir()
  res_nro_hotel:= reg.nro_hotel
  res_tipo_hab:= reg.tipo_hab
  total_noche_hotel:= 0 
  acum_tipo_hab:= 0
  cant_dob:= 0
  cant_suite:= 0 

    Mientras NFDA (reservas) hacer 
       SI reg.nro_hotel <> res_nro_hotel entonces
          corte_hotel ( )
           sino
            Si reg.tipo_hab <> res_tipo_hab entonces
              corte_habitacion ( )
            FinSi
        Finsi

        Segun reg.nro_tipo_hab hacer
          :dob= cont_dob + cant_noche
          :suite:= cont_suite + cant_noche 
        FinSegun
        
        acum_tipohab:= acum_tipohab + reg.cont_noches

        leer(reservas,reg) 
     
    Finmentras
    
    corte_hotel ( )

    cerrar(reservas)
    cerrar(tipos)          
FinAccion