#count how many values have in common 3 subset

import sys

# Se vuoi leggere/scrivere da file decommenta qua
fin = open("cover-input-1.txt", "r")  # File di input fornito dalla piattaforma
fout = open("output.txt", "w")  # File di output fornito dalla piattaforma

# Se vuoi leggere/scrivere da linea di comando decommenta qua
#fin = sys.stdin  # File di input fornito dalla piattaforma
#fout = sys.stdout  # File di output fornito dalla piattaforma


def conta(N, K, ranges):
    print(N, K, ranges)
    count = 0

    for i in range(0, N):
        for j in range(i+1, N):
            for w in range(j+1, N):
                if (((ranges[w][0] <= K) and (ranges[w][1] >= K)) and ((ranges[j][0] <= K) and (ranges[j][1] >= K)) and((ranges[i][0] <= K) and (ranges[i][1] >= K))):
                    print(i,j,w)
                    count += 1

    return count


N, K = map(int, fin.readline().strip().split(" "))
ranges = []

for _ in range(N):
    start, end = map(int, fin.readline().strip().split(" "))
    ranges.append([start, end])

print(conta(N, K, ranges), file=fout)
