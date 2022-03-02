def main():
    l = int(input())
    d = int(input())
    x = int(input())
    x1 = l
    while True:
        s = [int(s) for s in str(x1)]
        if (sum(s) == x):
            print(x1)
            break
        x1 += 1
    x1 = d
    while True:
        s = [int(s) for s in str(x1)]
        if (sum(s) == x):
            print(x1)
            break
        x1 -= 1
if __name__ == "__main__":
    main()
