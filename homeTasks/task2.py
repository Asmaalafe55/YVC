# 7) Write a program that will ask the user some questions and print an appropriate report.
# It will find out if :
# - He drinks coffee, and if so, ask how much. Then ask if he drinks tea
# and again only if he answered "yes", ask how many cups a day. 
# (If he doesn't drink any drink, don't ask how much!).
# Assume that the user's only answers are yes / no and integers for the quantities.
# Use the examples to see the 4 possible outputs.

def coffee_tea():
    coffee_answer = input("Do you drink coffee? ")
    if coffee_answer=='yes':
        coffee_num = int(input("How many cups per day? "))

    tea_answer = input("Do you drink tea? ")
    if tea_answer=='yes':
        tea_num = int(input("How many cups per day? "))
        
    if coffee_answer=='yes' and tea_answer=='yes':
        print("You drink both coffee and tea, together ", coffee_num+tea_num, "cups a day.")
    elif coffee_answer== 'yes' and tea_answer=='no':
        print("You drink coffee, ", coffee_num, "cups a day.")
    elif coffee_answer== 'no' and tea_answer=='yes':
        print("You drink tea, ", tea_num, "cups a day.")
    else :
        print("You don't drink coffee or tea at all.")
        
# coffee_tea()

# 8) Receive two numbers from the user: x,y These numbers indicate the position of 
# a point in an axis system. Print where is this point: the beginning of labor? 
# On the X axis on the Y axis? In the first / second / third / fourth quadrant?

def where():
    x= float(input("enter X: "))
    y= float(input("enter Y: "))
    if x==0 and y==0:
        print("ראשית הצירים")
    elif x==0:
        print("Y ציר")
    elif y==0:
        print("X ציר")
    if x>0 and y>0:
        print("רביע ראשון")
    elif x>0 and y<0:
        print("רביע שלישי")
    elif x<0 and y>0:
        print("רביע שני")
    else:
        print("רביע רביעי")
        
# where()

# 9) The following program helps edit a book for printing. It asks the user:
# How many words are in each line?
# How many lines are there on each page?
# How many words in total should be printed?
# It can be assumed that all the pages are the same, and each line has the same number
# of words At the end, a report of how many pages will be required will be printed for printing.

def pages():
    words_per_line = int(input("Words per line? "))
    lines = int(input("Lines per page? "))
    words_per_page = int(input("How many words to print? "))
    pages_num = words_per_page/(words_per_line*lines)
    if pages_num % 1 != 0 :
        pages_num = int(pages_num) +1
    print("We need", int(pages_num), "pages")
    
# pages()

# 10) Receive 3 integers from the user and print the middle one in terms of size.

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

# med()

# 11) Write a program that solves a quadratic equation. 
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
        

# eq(2,3,5)
# eq(1,8,16)
# eq(2,-3,1)
