def main():
    inf = input().split(" ")
    g = int(inf[0])
    t = int(inf[1])
    tot = (g-t) * 0.9
    for e in input().split(" "):
        tot -= int(e)
    print(int(tot))


if __name__ == "__main__":
    main()
