# 1) 

def f1():
    x=1
    y= 2*(x**3) - (x*x) +7*x -5
    
    while y<1000000:
        print(y)
        x=x+1
        y= 2*(x**3) - (x*x) +7*x -5
        
# 2) 

def f2():
    x=4
    y= x*2-3
    
    while y<1000000000:
        print(y)
        x=y
        y= x*2-3
        

# f2()


# 3)

def f3():
    i=1
    a1 = 1/(2**i)
    sum = a1
    while sum<0.9999999999:
        print(sum)
        i+=1
        a1 = 1/(2**i)
        sum += a1

# f3()

# 4) 

def f4():
    sum =0
    a = int(input("enter number : "))
    while (a>=0):
        sum+=a
        a = int(input("enter number : "))
        
    print("sum: ", sum)

# f4()