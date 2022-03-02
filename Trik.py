def main():
    moves = input()
    ball = [1, 0, 0]
    for i in moves:
        x = 2
        y = 0
        if i == "A":
            x = 0
            y = 1
        elif i == "B":
            x = 1
            y = 2
        tmp = ball[x]
        ball[x] = ball[y]
        ball[y] = tmp
    for i in range(len(ball)):
        if ball[i] == 1:
            print((i+1))
if __name__ == "__main__":
    main()
