# 3) receive  number and return the sum of all the numbers that we can divide 

def f3(N):
    sum =0
    for i in range(1,N+1):
        if N%i == 0 :
            sum += i
    return sum

# print(f3(3))

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

# 15) Return the sum of the evens of all the numbers in the list
# f15([3,5,6,11,12,200,333]) --> 218
# f15([3,7,11,239]) --> 0

def f15(L):
    sum=0
    for i in range(len(L)):
        if L[i]%2==0:
            sum += L[i]
    return sum

# print(f15([3,5,6,11,12,200,333]))
# print(f15([3,7,11,239]))

# 16) Take a list of numbers, return how many of them are greater than their two neighbors
# f16([12,7,2,6,23,22,14,44,30,33,33,22])

def f16(L):
    counter = 0
    for i in range(1,len(L)):
        if L[i]>L[i-1] and L[i]>L[i+1]:
            counter+=1
    return counter

# print(f16([12,7,2,6,23,22,14,44,30,33,33,22]))

# 17) Pick up a sentence and return its initials (first letter of each word)
# f17('Hello, this is me') --> 'Htim'

def f17(s):
    string = s[0]
    for l in range(len(s)):
        if s[l]== " ":
            string += s[l+1]
    return string
        
# print(f17('Hello, this is me'))

# 18) Take in a list of words, return the longest word in it (if there are several - the first of them)
# f18(['which', 'is', 'longest', 'word']) --> 'longest'
# f18(['123', '3456', '4532','2']) --> '3456'

def f18 (L):
    max=''
    for i in range(len(L)):
        if len(L[i])>len(max):
            max = L[i]
    return max

# print(f18(['123', '3456', '4532','2']))

# 20) Receive a string and return the multi of all the numbers in it

def f20(s):
    num = '0123456789'
    mul=1
    for l in s:
        if l in num:
            mul*= int(l)
    return mul

# print(f20('dgvhb217b'))

# 21) Receive a string and when you see # then to erase it, and it erases one letter from the end of the word 

def f21(string):
    result =""
    for char in string:
        if char != "#":
            result = result + char
        else:
            result = result [:-1]
    return result
    
# print(f21('#ik3l##3d3#df#'))

# 24) A variety of people come to the hospital for treatment.
# Assume that they are numbered according to the following options:
# A number starting with the digit 1 is a medical emergency
# A number starting with 2 = baby;
# A number starting with 3 = disabled;
# Any other number = the rest of the people.
# A medical emergency will be dealt with first. After him, priority will be given to the infants and the disabled 
# (without any difference between them, according to who arrived first) and at the end the rest of the people in the order of their arrival.
# Write a function that will take a list of people in order of their arrival, and return a list of the order in which they are handled

def f24(L):
    L1=[]
    L2=[]
    L3=[]
    for i in range(len(L)):
        if str(L[i])[0] == 1:
            L1+=[L[i]]
        elif str(L[i])[0] == 2 or str(L[i])[0] == 3:
            L2+=[L[i]]
        else:
            L3+=[L[i]]
    L = L1 + L2 + L3
    return L

# print(f24([456,212,344,110,190,6667,180,55115,22,98]))

# 25) Receive a string, return how many different characters are there in it?

def f25(s):

    return len(set(s))

# 26) Take a list of numbers and return how many different digits there are in them (all together)

def f26(lst):
    string=""
    for value in lst:
        string += str(value)
    
    return(f25(string))

# print(f26([123,456,789]))

# 27) Receive 2 lists and return one list of the parameters without duplicates
# f27([1,3,2,3,4,5],[6,7,5,9,0]) --> [0,1,2,3,4,5,6,7,9]

def f27(lst1, lst2):
    # Option1
    lst1 = set(lst1)
    lst2 = set(lst2)
    return list(lst1|lst2)
    # Option2
    # return set(lst1)|set(lst2)

# print(f27([1,3,2,3,4,5],[6,7,5,9,0]))

# 28) Take 3 lists, return a list of those that are in at least two of them
# f([4,2,1,7],[2,8,7,9,5],[1,7,5,30]) --> [1,2,5,7]

def f28(L1,L2,L3):
    lst1 = set(L1)&set(L2)
    lst2 = set(L1)&set(L3)
    lst3 = set(L3)&set(L2)
    l = list(lst1|lst2|lst3)
    return l
    
# print(f28([4,2,1,7],[2,8,7,9,5],[1,7,5,30]))