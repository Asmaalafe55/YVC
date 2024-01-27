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

# 18) Write a function that takes as a parameter a positive whole number,
# and prints in one line each number in its own quantity

def f18(num):
    for i in str(num):
        print(i*int(i),end="")

# f18(41802)

# 19) Use loops to print the following series

def f19ab(a,b,c):
    for i in range(a,b,c):
        print(i, end=" ")
        
# f19ab(23,51,3)
# f19ab(45,109,3)

def f19cd(x,a):
    for i in range(a):
        if x%2==0:
            print(x, end=" ")
            x-=1
        else:
            print(x, end=" ")
            x+=1

# f19cd(1,10)
# f19cd(3,10)

def f19e(l,n):
    for i in range(n):
        for j in range(3):
            print(l[j], end=" ")

# f19e([2,7,3],11)
    
def f19f(a,b):
    x=0
    for i in range(a,b):
        if x==0:
            print(i, end=" ")
            x=1
        else:
            print(-i, end=" ")
            x=0

# f19f(1,11)


# 20) Write a function that receives 3 numerical parameters a1,n,d: and prints
# an arithmetic series (the difference between the terms is constant)
# that has n terms, starting from a1 and the difference between terms d

def sidra(a1,n,d):
    for i in range(n):
        print(a1+(i*d), end=" ")

# sidra(222,4,10)