#Permitir el ingreso de una clave y volver a pedir su ingreso en caso que sea incorrecta 
clavecorrecta = 123 
while True: 
intento = int(input('Clave de acceso: ')) 
if intento == clavecorrecta: Break 
print("¡Clave correcta! Acceso concedido.") 

