//Se desea comprar una PC y una impresora. Calcular el precio total: el cual está dado por la suma de los precios de costos, los porcentajes de ganancia del vendedor y un 21% de IVA. Supóngase una ganancia delvendedor del 12% por la PC y 7% por la impresora. Se leen los costos y se imprimen el precio total de ventas.
Accion calcular_Precio es
	Ambiente
		PrecioPC:Real;//variable de entrada
		PrecioImpresora:Rea;//variable de entrada
		PrecioTotal:Real;//variable de salida
		IVA=0.21;

	Proceso
		Escribir("Este programa calcula el precio total de una PC y una impresora")
		Escribir("Ingrese el precio de la PC: ");
		Leer(PrecioPC);//lee el precio de la PC
		Escribir("Ingrese el precio de la impresora: ");
		Leer(PrecioImpresora);//lee el precio de la impresora
		PrecioTotal:=PrecioPC*0.12+PrecioImpresora*0.07;
		PrecioTotal:=PrecioTotal+PrecioPC+PrecioImpresora+IVA;
		Escribir("El precio total de las compras es:",precioTotal)
FinAccion