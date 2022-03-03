def main():
    m = [int(i) for i in input().split(" ")]
    l = [m[1], m[2], ((m[1]**2)+(m[2]**2))**0.5]
    for i in range(m[0]):
        tmp = int(input())
        if all(i < tmp for i in l):
            print("NE")
        else:
            print("DA")

if __name__ == "__main__":
    main()
