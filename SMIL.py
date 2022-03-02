def main():
    bits = list(input())
    for i in range(len(bits)):
        if bits[i] == ":" or bits[i] == ";":
            if i+1 < len(bits) and bits[i+1] == ")":
                print(i)
            elif i+2 < len(bits) and bits[i+1] == "-":
                if bits[i+2] == ")":
                    print(i)

if __name__ == "__main__":
    main()
