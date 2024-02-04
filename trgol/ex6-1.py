# 4) Enter a number and return whether
# it is divisible by all of the numbers
# from 11 - 19 to (inclusive)

def f4(N):
    for i in range(11,20):
        if N%i!=0:
            return False
        return True

# print(f4(1234567890))
# print(f4(232792560))

# 5) Enter a number and return whether
# it is divisible by at least one of the numbers
# from 11 - 19 to (inclusive)

def f5(N):
    for i in range(11,20):
        if N%i!=0:
            return True
        return False

# print(f5(882487))
# print(f5(882488))

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

# print(f8(20))

# 9) A function that receives N and returns 
# the list of numbers X that are divisible by 3 and are in the range:
# N-5<=X<=N+15
# f(76) --> [72,75,78,81,84,87,90]

def f9(N):
    L=[]
    for i in range(N-5,N+15):
        if i%3==0:
            L+= [i]
    return L

# print(f9(76))

# 10) A function that receives N and returns 
# a list and in it the first 10 multiples, positive
# f(53) --> [53,106,159,212,265,318,371,424,477,530]

def f10(N):
    L = []
    for i in range(1,11):
        L += [N*i]
    return L

# print(f10(53))

# 11) A function that receives N and returns 
# a list and in it the first 10 multiples, positive and less than 100
# f(13) --> [13,26,39,52,65,78,91]

def f11(N):
    L = []
    for i in range(1,100):
        if N*i<100:
            L += [N*i]
    return L

# print(f11(13))
# print(f11(25))

# 12) return the max number that contains the '8' digit
# f([11,2345,80,28,111,87,51,8,100]) --> 87

def f12(L):
    max8=0
    for i in range(len(L)):
        if '8' in str(L[i]):
            if L[i]>max8:
                max8=L[i]
    return max8

# print(f12([11,2345,80,28,111,87,51,8,100]))

# 13) return how many even numbers is in the list you received
# f([1,6,66,8,11,8,13]) --> 4

def f13(L):
    counter =0
    for i in range(len(L)):
        if L[i]%2==0:
            counter+=1
    return counter

print(f13([1,6,66,8,11,8,13]))