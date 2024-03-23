import sys 

def numbers_concat(n, d):
    return d+str(n)+d

d, n = input().split()
n = int(n)
flag = True
if n > 60 or n < 1:
    print("not supported")
elif int(d) > 9 or int(d) < 1:
    print("not supported")
else:
    for i in range(2, n+1):
        d = numbers_concat(i, d)
    
    sum = 0
    for i in d:
        sum += int(i)
    
    sys.stdout.write(str(sum))