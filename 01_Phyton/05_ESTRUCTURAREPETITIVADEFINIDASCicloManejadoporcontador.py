#El código itera 20 veces, solicitando al usuario que ingrese una URL y luego pregunte si es falsa. Si el usuario responde "si", el contador de noticias falsas se incrementa. Finalmente, imprime el total de noticias falsas encontradas.
contF = 0  # Inicializa el contador de fake news
for i in range(20):  # Repite 20 veces (del 0 al 19)
    url = input("Ingrese la URL: ")
    fake = input("¿Es fake new? (si/no): ").lower() == "si"
    if fake:  # Si es fake news
        contF += 1  # Incrementa el contador
print(f"Total de fake news = {contF}")