# append function
# write a function that receives, return all of them multiple by 10
# f([2,7,6]) --> [20,70,60]

def f(L1):
    L2=[]
    for num in L1:
        L2 = L2+[num*10]
        # L2.append(11) // adds and saves in list
    return L2

# filter function
# receive a string and return the ones that are numbers
# f('435ghjb82hbi8"2em,./4ff') --> '43582824'

def f(s1):
    s2 = ''
    for tav in s1:
        if tav in '1234567890':
        # if tav.isdigit():
            s2 += tav
    return s2
        
# f('435ghjb82hbi8"2em,./4ff')


# in a game 7 boom, we say all numbers but these that contains 7 and 
# devidable by 7, and in its place we say boom
# how many boom in 1-1000000

def f():
    counter=0
    for i in range(1,1000000):
        if i%7==0 or '7' in str(i) :
            counter+=1
    return counter
f()