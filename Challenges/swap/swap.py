#!/bin/env python3

import sys

# Se vuoi leggere/scrivere da file decommenta qua
fin = open("swap-input-2.txt", "r")  # File di input fornito dalla piattaforma
fout = open("output.txt", "w")  # Output da inviare alla piattaforma

# Se vuoi leggere/scrivere da linea di comando decommenta qua
#fin = sys.stdin  # input fornito dalla piattaforma
#fout = sys.stdout  # Output da inviare alla piattaforma


def swap(N, V):
    print(N, V)
    j = 0
    s = -1
    num = 0
    count = 0
    for i in range(1, N):
        if s != -1:
            if num > V[i]:
                continue
            else:
                new = V[i-1]
                NEWV = V[s:i-1]
                NEWV[0] = new
                count = 1 + swap(len(NEWV), NEWV)
                return count


        else:
            if V[i] < V[j]:
                s = j
                num = V[j]
                j = -1
                print(s)
            else:
                j += 1
    if s == -1:
        return 0
    else: 
        new = V[i]
        NEWV = V[s:i]
        NEWV[0] = new
        count = 1 + swap(len(NEWV), NEWV)
        return count


N = int(fin.readline().strip())
V = list(map(int, fin.readline().strip().split(" ")))
print(swap(N, V), file=fout)
