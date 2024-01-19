# Write a function that takes an integer as a parameter.
# It will print for him an appropriate message whether the number is even or not
# divisible by 3 or not and whether it is divisible by 5 or not

def div235 (num):
    if num%2 == 0:
       print (num, "is even")
    else:
       print (num, "is odd")
    if num%3==0:
       print (num, "is divisible by 3")
    else:
       print (num, "is not divisible by 3")
    if num%5==0:
       print (num, "is divisible by 5")
    else:
       print (num, "is not divisible by 5")
        
div235(40)
div235(39)

# Write a function that will take two numbers and print a message about 
# how many of them are positive (greater than zero)  

def pos(num1, num2):
    if (num1 and num2 > 0):
        print("Both are positive")
    if(num1>0 or num2>0):
        print("One of them is positive")
    print ("None of them is positive")

pos(12,0)

# Receive 3 integers from the user and print the middle one in terms of size.

def med():
    num1 = int(input("enter #1 number: "))
    num2 = int(input("enter #2 number: "))
    num3 = int(input("enter #3 number: "))
    if num1<=num2<=num3 or num3<=num2<=num1:
        print(num2,"is in the middle")
    elif num2<=num1<=num3 or num3<=num1<=num2:
        print(num1,"is in the middle")
    elif num1<=num3<=num2 or num2<=num3<=num1:
        print(num3,"is in the middle")

med()

# Write a program that solves a quadratic equation. 
# The quadratic equation function will take a,b,c and print if there is no solution 
# or if there are 2 solutions / a single solution and the solutions themselves.

def eq(a,b,c):
    root = b*b -4*a*c
    if root<0:
        print("There is no solution")
    elif root==0:
        print("There is one solution : x=",-b/2*a)
    else:
        root = root**0.5
        sol1= (-b - root)/2*a
        sol2= (-b + root)/2*a
        print("There is two solutions : ")
        print("x1 = ", sol1)
        print("x2 = ", sol2)
        

eq(2,3,5)
eq(1,8,16)
eq(2,-3,1)
