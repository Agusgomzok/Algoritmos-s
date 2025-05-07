#El programa primero da la bienvenida al usuario, luego pide ingresar un número. Si el número ingresado es diferente de 0, entra en un bucle while donde suma el número ingresado a la variable total y pide un nuevo número. El bucle continúa hasta que el usuario ingresa 0, momento en el que se imprime la suma total de los números ingresados.
print("Te doy la bienvenida a LotiALG")

fin = int(input("Ingrese primer número (0 para salir): "))
total = 0

while fin > 0:
    total += fin
    fin = int(input("Ingrese nuevo valor: "))

print("La suma total es", total)
