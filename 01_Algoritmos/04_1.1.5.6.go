//Realizar un programa que lea dos número complejos, (a,b) y (c,d), y calcule su producto:

//(a,b)∗(c,d)=(ac−db,ad+bc)
Accion 1.1.5.6 es
Ambiente
	Ambiente
		a:Num //son variables de los numeros complejos
		b:Num //son variables de los numeros complejos
		c:Num //son variables de los numeros complejos
		d:Num//son variables de los numeros complejos
		
		ac:Num
		db:Num
		ad:Num
		bc:Num
		Resultado:Num
	
		Proceso
		Escribir("este programa que lee dos número complejos, (a,b) y (c,d), y calcula su producto ")
		Escribir("Ingrese 4 numeros complejos",a,b,c,d)
		Leer(a,b,c,d)
		ac:=a*c
		db:=d*b
		ad:=a*d
		bc:=b*c

		Resultado:=(ac−db,ad+bc)
		Escribir("el resultado del producto de los numeros complejos es" ,Resultado)
Fin accion

