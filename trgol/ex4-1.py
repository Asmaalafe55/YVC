# 6) Write a function that will receive a word from the user and an 
# integer n and print the word n times, in separate lines

def g():
    x = input("enter a word: ")
    n = int(input("how many times: "))
    for i in range(n):
        print(x)

# g()

# 7) Write a function that accepts two parameters: a string + an integer N
# It prints the string N times including numbering of the lines.

def gg(strr, num):
    for i in range(num):
        print(i,strr)
        
# gg('njnj',5)

# 8) Write a program that accepts a number N and prints a pyramid of zeros of height N

def zero():
    num = int(input("Please enter a number: "))
    for i in range(num):
        print("0"*(i+1))
        
# zero()

# 9) Take a string and return the first uppercase letter that appears in it.
# If there is no uppercase letter return an empty string.

def f(strr):
    capital = "QWERTYUIOPASDFGHJKLZXCVBNM"
    for i in strr:
        if i in capital:
            return i
    return ""

# print(f("1+asdf 2-QfejjDRB"))

# 10) Take a string (lower case only) return the first letter of the alphabet that appears in it.

def ff(strr):
    smaller = strr[0]
    for l in strr:
        if l<smaller:
            smaller=l
    return smaller
        
# print(ff("qwerty"))

# 11) Receive an integer N from the user and print N lines from the following
# template (note that after that the whole number is not printed)



# 12) Get the width and height of a rectangle from the user and print a rectangle
# like in the example, with the rows containing "X" or "O" alternately only.
# The first line will always be "X", regardless of the numbers entered by the user,
# which only determine the size of the rectangle.