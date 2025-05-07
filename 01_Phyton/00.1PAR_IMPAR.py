#disparador:usuario ingresa una cifra
numero = int(input("ingrese un numero:"))

if numero % 2 == 0:
    resultado = "par"
else:
    resultado = "impar"

print(f"el numero {numero} es {resultado}.")