from itertools import combinations

def generate_combinations(elements, length):
    return list(combinations(elements, length))

def is_palindrome(s):
    return s == s[::-1]

n = int(input())
flag = True
if n > 10000 or n < 2:
    print("not supported")
else:
    strings = []
    count = 0
    for i in range(0, n):
        number = input()
        if len(number) > 600 or len(number) < 1:
            flag = False
            break
        
        if number in strings:
            flag = False
            break
        strings.append(number)

        if not number.islower():
            flag = False
            break

    if flag:
        count = 0
        res = generate_combinations(strings, 2)
        print(res)

        for i in res:
            word = i[0] + i[1]
            word2 = i[1] + i[0]
            if is_palindrome(word):
                count += 1
            if is_palindrome(word2):
                count += 1

        print(count)