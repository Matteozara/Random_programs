#move the number on wrong position on the right one

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
    for i in range(1, N):
        if s != -1:
            if num > V[i]:
                continue
            else:
                return ((i - s) -1)

        else:
            if V[i] < V[j]:
                s = j
                num = V[j]
            else:
                j += 1
    if s == -1:
        return 0
    else: 
        return ((N - s) - 1)


N = int(fin.readline().strip())
V = list(map(int, fin.readline().strip().split(" ")))
print(swap(N, V), file=fout)
