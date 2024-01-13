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
# 7) print(g(g(9,5),g(1,3))) => 6
# 7) print(10*func()+7) => 557
# 7) print(addx(8)) => x8x , print(addx(1)+addx([])) => x1xx[]x , print(addx(addx(8>5))) => xx8>5xx
# 7) print([b(9),b(2),b(5)]) => true,false,false , print(b(1)==b(2)) => false
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

