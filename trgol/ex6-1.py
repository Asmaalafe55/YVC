# 6) A function that receives a natural 
# number and returns a list containing all 
# the numbers from 1 - N (inclusive)
# f6(7) -- > [1,2,3,4,5,6,7]

def f6(num):
    L = []
    for i in range(1,num+1):
        L += [i]
    return L

# print(f6(7))

# 7) a function that receives a normal number N, it will return a list 
# that contains all the even numbers from 2 till N
# f7(10) --> [2,4,8,10]

def f7(N):
    L=[]
    for i in range(2,N,2):
        L+= [i]
    return L

# print(f7(10))

# 8) function that receives a normal number
# N and it will return a list of all the numbers
# from 1 to N that deviable 
# f8(20) --> [1,2,4,5,10,20]

def f8(N):
    L=[]
    for i in range(1,N+1):
        if N%i==0:
            L += [i]
    return L

print(f8(20))