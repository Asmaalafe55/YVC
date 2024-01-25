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
            
    
ex12()


# 23) Write a function that will take two integers a, b and then print the first 
# multiples of the number. Try to make the printout complete as in the examples 
# (not only Final result).

def ex23(a,b):
    for x in range(1,b+1):
        print(x,'x',a, "=", a*x)
        
# ex23(177,3)


