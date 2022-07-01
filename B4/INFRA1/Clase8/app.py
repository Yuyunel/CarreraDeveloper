#encoding:UTF-8
import random

while True: 
    aleatorio = random.randrange(0, 5)
    elijePc = ""
    print("1)Piedra")
    print("2)Papel")
    print("3)Tijera")
    print("4)Spock")
    print("5)Lagarto")
    print("6)Salir del Programa")
    opcion = int(input("Que eliges: "))
    
    if opcion == 1:
        eligeUsuario = "piedra"
    elif opcion == 2:
        eligeUsuario = "papel"
    elif opcion == 3:
        eligeUsuario = "tijera"
    elif opcion == 4:
        eligeUsuario = "spock"
    elif opcion == 5:
        eligeUsuario = "largarto"
    elif opcion == 6:
        print ("Nos vemos!")
        break
    else:
        print ("Valor Invalido")
        continue
        
    print("Tu eliges: ", eligeUsuario)   
    if aleatorio == 0:
        eligePc = "piedra"
    elif aleatorio == 1:
        eligePc = "papel"
    elif aleatorio == 2:
        eligePc = "tijera"
    elif aleatorio == 3:
        eligePc = "spock"
    elif aleatorio == 4:
        eligePc = "lagarto"
    print("PC eligio: ", eligePc)
    print("...")
    
    if eligePc == "piedra" and eligeUsuario == "papel":
        print("Ganaste, papel envuelve piedra")
    elif eligePc == "papel" and eligeUsuario == "tijera":
        print("Ganaste, tijera corta papel")
    elif eligePc == "tijera" and eligeUsuario == "piedra":
        print("Ganaste, piedra pisa tijera")
    elif eligePc == "spock" and eligeUsuario == "papel":
        print("Ganaste, papel desautoriza spock")
    elif eligePc == "lagarto" and eligeUsuario == "piedra":
        print("Ganaste, piedra aplasta lagarto")
    elif eligePc == "piedra" and eligeUsuario == "spock":
        print("Ganaste, spock vaporiza piedra")
    elif eligePc == "papel" and eligeUsuario == "lagarto":
        print("Ganaste, lagarto devora papel")
    
        
    if eligeUsuario == "piedra" and eligePc == "papel":
        print("Perdiste, papel envuelve piedra")
    elif eligeUsuario == "papel" and eligePc == "tijera":
        print("Perdiste, tijera corta papel")
    elif eligeUsuario == "tijera" and eligePc == "piedra":
        print("Perdiste, piedra pisa tijera")
    elif eligeUsuario == "spock" and eligePc == "lagarto":
        print("Perdiste, lagarto envenena  spock")
    elif eligeUsuario == "largato" and eligePc == "tijera":
        print("Perdiste, tijera decapita a lagarto")
    elif eligeUsuario == "papel" and eligePc == "lagarto":
        print("Perdiste, lagarto devora papel")
    elif eligeUsuario == "spock" and eligePc == "papel":
        print("Perdiste, papel desautoriza spock")
    elif eligeUsuario == "lagarto" and eligePc == "piedra":
        print("Perdiste, piedra aplasta lagarto")
    elif eligePc == eligeUsuario:
        print("Empate")
    again = input("Jugamos de nuevo? Si/No: ")
    if 'si' in again:
        continue
    elif 'no' in again:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")