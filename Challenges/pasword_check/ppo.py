#!/bin/env python3

import sys
from tokenize import Special

# Se vuoi leggere/scrivere da file decommenta qua
fin = open("input_test.txt", "r")  # File di input fornito dalla piattaforma
fout = open("output.txt", "w")  # Output da inviare alla piattaforma

# Se vuoi leggere/scrivere da linea di comando decommenta qua
#fin = sys.stdin  # input fornito dalla piattaforma
#fout = sys.stdout  # Output da inviare alla piattaforma


def controlla(nuova, vecchia):
    special_char = ["|", "\"", "!", "£", "$", "%", "&", "/", "(", ")", "=", "?", "'", "^", "[", "]", "+", "*", "@", "°", "#", ",", ";", ".", ":"]
    num = ["1","2","3","4","5","6","7","8","9","0"]
    LET = ["Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"]
    let = ["q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"]
    upper = False
    lower = False
    number = False
    special = False
    count = 0

    print(nuova, " || ", vecchia)

    #check length
    if len(nuova) < 8 or len(nuova) > 16:
        return 0
    
    #check chars
    for i in nuova:
        if i in LET:
            upper = True
        if i in let:
            lower = True
        if i in num:
            number = True
        if i in special_char:
            special = True

    if (upper != True) or (lower != True) or (number != True) or (special != True):
        return 0

    #check deifferent from old
    if len(nuova) == len(vecchia) or len(nuova) == (len(vecchia) - 1) or len(nuova) == (len(vecchia) + 1):
        soglia = len(nuova)
        if len(vecchia) < soglia:
            soglia = len(vecchia)
        for i in range(0, soglia):
            if nuova[i] != vecchia[i]:
                count += 1

                if count >= 2:
                    break
        if (count < 2 and len(vecchia) == len (nuova)) or (count == 0):
            return 0

    # SCRIVI QUA IL TUO CODICE
    # RITORNA 0 SE LA NUOVA PASSWORD NON SEGUE LE SPECIFICHE
    # RITORNA 1 SE LA NUOVA PASSWORD SEGUE LE SPECIFICHE
    return 1


N = int(fin.readline().strip())

for _ in range(N):
    nuova, vecchia = fin.readline().strip().split(" ")
    print(controlla(nuova, vecchia), file=fout)
