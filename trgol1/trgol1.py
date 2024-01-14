# יש לפתור מפרק מספר 2 את התרגילים הבאים:  5, 7, 8, 12, 15, 16, 17
# עבור התרגילים 7 ו- 8 ניתן לכתוב את תוצאת ההדפסה כהערה בקוד
# יש להגיש קובץ אחד המכיל את כלל הפתורנות ולא קובץ נפרד עבור כל פונקציה.

# 5) Write a function that will ask the user what his name is
# and print a message. A name will appear in the message that will be printed
# the user and at the end also your name:


def f1():
    name = input("Hi, What is your name? ")
    print ("Hello " + name + ", my name is Raz.")
    

# 6) Write a function that takes as parameters the original price
# and the amount of the discount in percentages, and print a report as an example:

def discount(a,b):
    print("original price: ", a)
    print("discount: ", b , "percent")
    print("new price: ", a - a*b/100)
    
# 7) What will be printed in these functions
# 7) 6
# 7) 557
# 7) x8x, x1xx[]x, xx8>5xx
# 7) true,false,false , false
# 7)
# 7)

# 8)
# 8)
# 8)
# 8)
# 8)
# 8)

# 12) Write a program that will ask the user what exactly he bought, 
# how many units of this product, and what was the price per unit. 
# It will then print an appropriate report

def but_item():
    product = input ("What did you buy? ")
    quantity = input ("How many of those did you get? ")
    price = input("How much was each one? ")
    print("You bought ", quantity, " ", product, " and paid total of ", price*quantity, " shekels.")

# 15) Write a program that captures the employee's name,
# the employee's hourly wage,
# the number of working hours per day and the number of working days per month
# It prints a line that informs the employee what his gross salary is for this month,
# while taking into account NIS 20 a fixed payment per day for travel.

def salary():
    name = input("Enter your name: ")
    rate_per_hour = input("Enter your rate per hour: ")
    hours_per_day = input("Enter the number of hours you work per day: ")
    days_per_month = input("Enter the numbers of days you work per month: ")
    print(name, " , your monthly salary is : ",rate_per_hour*hours_per_day*days_per_month -20*days_per_month , "  NIS")
    
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