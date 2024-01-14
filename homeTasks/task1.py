# Trgil Baiet 1

# 5) Write a function that will ask the user what his name is
# and print a message. A name will appear in the message that will be printed
# the user and at the end also your name:


def f1():
    name = input("Hi, What is your name? ")
    print ("Hello " + name + ", my name is Raz.")
    
f1()
print ('\n')

    

# 6) Write a function that takes as parameters the original price
# and the amount of the discount in percentages, and print a report as an example:

def discount(a,b):
    print("original price: ", a)
    print("discount: ", b , "percent")
    print("new price: ", a - a*b/100)
    
discount(100, 50)
print ('\n')

    
# 7) What will be printed in these functions
# 7) 6
# 7) 557
# 7) x8x, x1xx[]x, xx8>5xx
# 7) true,false,false , false
# 7) true, false
# 7) 1 8 3 5 10, 1 9 1 7 4

# 8) 345, 15, 48
# 8) 19, -14, 21, true
# 8) true, false
# 8) 1 1 3 1

# 12) Write a program that will ask the user what exactly he bought, 
# how many units of this product, and what was the price per unit. 
# It will then print an appropriate report

def but_item():
    product = input ("What did you buy? ")
    quantity = int(input ("How many of those did you get? "))
    price = float(input("How much was each one? "))
    print("You bought ", quantity, " ", product, " and paid total of ", price*quantity, " shekels.")

but_item()
print ('\n')

# 15) Write a program that captures the employee's name,
# the employee's hourly wage,
# the number of working hours per day and the number of working days per month
# It prints a line that informs the employee what his gross salary is for this month,
# while taking into account NIS 20 a fixed payment per day for travel.

def salary():
    name = input("Enter your name: ")
    rate_per_hour = float(input("Enter your rate per hour: "))
    hours_per_day = int(input("Enter the number of hours you work per day: "))
    days_per_month = int(input("Enter the numbers of days you work per month: "))
    print(name, ", your monthly salary is : ", rate_per_hour*hours_per_day*days_per_month +20*days_per_month , "  NIS")

salary()
print ('\n')


# 16) Write a program that receives from the user the current month and the month he was born,
# then it prints a message reporting how many months his next birthday will be

def months_left():
    month_now = int(input("What month is it now? "))
    month_birth = int(input("What month were born in? "))
    month_left = month_birth-month_now
    if(month_left<0):
        month_left+=12
    print ("You have", month_left, "months left until your next birthday")
    
months_left()
print ('\n')

# 17) Write a function that takes a 3-digit integer and prints its digits separately

def f(num):
    x1=num%10
    num = num//10
    x2 = num%10
    num = num//10
    x3 = num%10
    print(x3)
    print(x2)
    print(x1)
    
f(462)
print ('\n')

