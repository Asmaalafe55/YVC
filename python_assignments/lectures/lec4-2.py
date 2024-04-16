# 11) Receive an integer N from the user and print N lines from the following
# template (note that after that the whole number is not printed)

def ex11():
    N = int(input("input how many times? "))
    for i in range(1, N+1):
        print(i * str(i%10))
        
# ex11()

# 12) Get the width and height of a rectangle from the user and print a rectangle
# like in the example, with the rows containing "X" or "O" alternately only.
# The first line will always be "X", regardless of the numbers entered by the user,
# which only determine the size of the rectangle.

def ex12():
    height = int(input("enter height: "))
    width = int(input("enter width: "))
    x  = 1
    for i in range(height):
        if x==1:
            print("X"*width)
            x= 0
        else:
            print("O"*width)
            x= 1
            
    
# ex12()

# 13) The following program manages someone's bank account. 
# At first it asks the user for his name, how much money he has in his account, 
# and how many operations he has done. Then, according to the number of actions he did:
# Asking if he deposited (d) or withdrew (w), and what amount.
# At the end, a report of the updated account balance is printed.

def bank():
    name = input("Whats your name? ")
    money = float(input("How much money in your account? "))
    trans = int (input("How many transactions? "))
    
    for i in range(trans):
        action = input("deposit (d) or withdraw (w)? ")
        if action == "w":
          w = float(input("How much? "))
          money = money - w
        elif action == "d":
          d = float(input("How much? "))
          money = money + d      
    print(name, ", you now have", money, "shekel.")

# bank()

# 15) Write a function that takes a list of numbers,
# and prints only those that contain the number "8"

def has8(list):
    for num in list:
        if "8" in str(num):
            print (num)
        

# has8([82,57,1.8,5.1,7])

# 16) Write a function that will take 2 lists and print the members common to both.

def f16(list1, list2):
    for i in list1:
        for j in list2:
            if (i == j):
                print(i)

# f16([1,11,23,56],[7,8,11,25,56,78])

# 23) Write a function that will take two integers a, b and then print the first 
# multiples of the number. Try to make the printout complete as in the examples 
# (not only Final result).

def ex23(a,b):
    for x in range(1,b+1):
        print(x,'x',a, "=", a*x)
        
# ex23(177,3)


