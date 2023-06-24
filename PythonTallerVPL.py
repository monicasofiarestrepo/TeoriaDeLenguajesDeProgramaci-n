#### punto 1

# a. Letras: P, Q, R, W, X , Y, Z
# b. Dígitos: 9, 8, 7, 6, 5
# c. Especiales: _, #, &, %


# Los códigos generados constan de: palabra “REF-” seguido de 2 dígitos, 4 letras y 1 carácter especial,
# ej: REF-86PQXY%. Encuentre todos los posibles códigos y retorna el tamaño de la lista
def PrimerPunto():
    
    letras=["P", "Q","R", "W", "X" , "Y", "Z"]
    digitos =["9", "8", "7", "6", "5"]
    especiales = ["_", "#","&", "%"]

    Codigos = ["REF-" + x + y + a+b+c+d+ z for x in digitos for y in digitos for a in letras for b in letras for c in letras
            for d in letras for z in especiales ]

    print(Codigos)
    print(len(Codigos))

#PrimerPunto()


#Segundo taller TLP


