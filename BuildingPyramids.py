def main():
    blocks = int(input())
    h = 0
    i = 1
    while True:
        blocks -= i**2
        if (blocks < 0):
            print(h)
            break
        h += 1
        i += 2

if __name__ == "__main__":
    main()
