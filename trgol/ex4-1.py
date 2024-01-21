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
        
gg('njnj',5)