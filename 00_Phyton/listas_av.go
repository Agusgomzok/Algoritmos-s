ACCION (prim_doble,ult_doble:puntero a nodo_doble)
AMBIENTE 
FECHA=Registro
	aa:n(4)
	mm:n(2)
	dd:(2)
fin_registro

nodo_doble=Registro
	fecha_dia:FECHA
	cant:n(4)
	cod:n(4)
	dni:n(8)
	prox,ant:puntero a nodo_doble
fin_registro
p,q:puntero a nodo_doble
res_fecha, res_cant,res_cod:entero

nodo_simple=Registro
	fecha_dia:FECHA
	cod:n(4)
	dni:n(8)
	prim:puntero a  nodo_simple
fin_registro

t,k,ant,prim:=:puntero a nodo_simple

switfieHabilitada()// devuelve verdadero,
desencrptarLugarFila()//
PROCEDIMIENTO cant() entonces 
	p:=prim_doble
	mientras p<> nill y p.fecha<> res_fecha hacer
		p:=p.prox
	fin:fin_mientras
	p.cant:p.cant-1
fin_proceimiento


Proceso
P:=prim_doble
esc('ingrese fecha del concierto')
leer(res_fecha
res_cant:=0

mientras p<>nill y p.fecha_dia= res_fecha hacer

	si switfieHabilitada(p.dni)entonces///tengo que eliminarla 
		cant()
		res_cant:=res_cant+1
		q:=prim
		SI Q=NILL entonces
			ESC8('lista vacia')
		sino 
			mientras q<>nill y (p.dni<> q.dni) hacer
				q:=q.prox
			fin_mientras
			si q=prim entonces
				prim:=p.prox
				(p.prox).ant:=nill 
			sino 
				SI Q=ULT entonces
					ULT:=p.ant 
					(p.ant).prox:=nill
				sino
					p.prox:=Q
					q.ant:=p.ant
					p.ant=q 
					(p.ant).prox:=Q
				fin_si
			fin_si
		fin_si
		DISPONER(P)
	sino // tengo que agregarlas a la fila e espera
	res_cod:=desencrptarLugarFila(p.dni)
	p.cod:=res_cod
	k:=prim
	ant:=nill
	nuevo(t)
	t.dni:=p.dni
	t.cod:=p.dni

	si prim=nill entonces
		prim:=t
		t.prox:=nill
	sino 
		mientras K<>nill y (t.cod> k.cod) hacer
			ant:=K
			k:=k.prox
		fin:mientras

		si k=prim entonces
			prim:=t
			t.prox:=k.prox
			ant.prox:=t
		sino 
			si k:=nill entonces
				ant.prox:=t
				t.prox:=nill
			sino
				ant.prox:=t
				t.prox:=K
			fin_si
		fin_si
	fin_si
	p:p.prox
fin_mientras


///seguno ejercicio
accion (prim:puntero a nodo)

nodo=Registro
	cod:=n(8)
	prox:=puntero a nodo
fin_registro

p,q :puntero a nodo
funcion ceros_multiplo (n:enteros,C) 
	SI N < 10 entonces
		SI 
	sino 
	 	



