def main():
    eye = input().split("()")
    if len(eye[0]) == len(eye[1]):
        print("correct")
    else:
        print("fix")
if __name__ == "__main__":
    main()
