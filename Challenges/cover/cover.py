import sys

# Se vuoi leggere/scrivere da file decommenta qua
fin = open("input_test.txt", "r")  # File di input fornito dalla piattaforma
fout = open("output.txt", "w")  # File di output fornito dalla piattaforma

# Se vuoi leggere/scrivere da linea di comando decommenta qua
#fin = sys.stdin  # File di input fornito dalla piattaforma
#fout = sys.stdout  # File di output fornito dalla piattaforma

def check(ranges, val):    
    for i in range(0, len(ranges)):
        if (ranges[i][0] <= val) and (ranges[i][1] >= val):
           if i+1 < len(ranges):
                new = ranges[i+1:]
                return 1 + check(new, val)
    return 0


def conta(N, K, ranges):
    count = 0
    lista = []

    for i in range(0, N):
        for j in range(ranges[i][0], ranges[i][1]+1):
            val = j
            if (i+1) < N and (val not in lista):
                new = ranges[i+1:]
                c= 1 + check(new, val)
                if c == K:
                    lista.append(val)
                    count += 1
            else:
                return count

    return count


N, K = map(int, fin.readline().strip().split(" "))
ranges = []

for _ in range(N):
    start, end = map(int, fin.readline().strip().split(" "))
    ranges.append([start, end])

print(conta(N, K, ranges), file=fout)

