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

def f9(strr):
    capital = "QWERTYUIOPASDFGHJKLZXCVBNM"
    for i in strr:
        if i in capital:
            return i
    return ""

# print(f9("1+asdf 2-QfejjDRB"))

# 10) Take a string (lower case only) return the first letter of the alphabet that appears in it.

def f10(strr):
    smaller = strr[0]
    for l in strr:
        if l<smaller:
            smaller=l
    return smaller
        
# print(f10("qwerty"))

# 18) Write a function that takes as a parameter a positive whole number,
# and prints in one line each number in its own quantity

def f18(num):
    for i in str(num):
        print(i*int(i),end="")

# f18(41802)

# 20) Write a function that receives 3 numerical parameters a1,n,d: and prints
# an arithmetic series (the difference between the terms is constant)
# that has n terms, starting from a1 and the difference between terms d

def sidra(a1,n,d):
    for i in range(n):
        print(a1+(i*d), end=" ")

# sidra(222,4,10)


# 21) Write a function that accepts a string as a parameter and prints each character twice, on a separate line

def f21(str):
    for i in str:
        print(i*10)
        
# f21("efv")

# 22) Write a function that accepts a string as a parameter and prints each character
# in a separate line, starting 10 times for the first character and each time it
# will print two more times, that is... 12,14,16

def f22(str):
    j = 0
    for i in str:
        print(i*(10+j))
        j+=2
        
# f22("dfdfn")

