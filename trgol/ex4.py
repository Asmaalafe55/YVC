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