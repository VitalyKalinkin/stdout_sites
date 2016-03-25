def find_the_most_beatiful(a):
    n = len(a)
    result = []
    while n > 0:
        a = sorted(a)
        value = -100500
        for i in range(len(a)):
            if a[i] > value and a[i] > 0:
                value = a[i]
                result += [a[i]]
                a[i] = -1
                n -= 1

    number = 0
    for i in range(1, len(result)):
        if result[i] > result[i - 1]:
            number += 1

    return number

if __name__ == "__main__":
    n = int(input())
    items = list(map(int, input().split()))
    print(find_the_most_beatiful(items))
