n = int(input())
if n > 100000 or n < 1:
    print("not supported")
else:
    count = 0
    for i in range(0, n):
        number = input()
        if len(number) in [12, 13]:
            if number[:3] == "+39":
                count += 1

    print("number of pizzerie: ", count)
