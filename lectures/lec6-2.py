# receive a string and return al list without duplicity 
# f1('qwerqwer rew r') --> ['q','w','e','r',' ']

def f1A(s):
    L = []
    for letter in s:
        if letter not in L:
            L = L + [letter]
    return L


def f1B(s):
    return list(set(s))

# receive a string and return boolean term if there is a b c d in this string, all of them without any other letters
# f2('abcabcbcbc') -> False, f2('abcabcbcbtc') -> False, f2('abcabdcbcbcd') -> True

def f2A(s):
    L=['a','b','c','d']
    L2=[]
    for i in set(s):
        if i not in L:
            return False
        L2 += [i]
    for i in L2:
        if L[i] not in L2:
            return False
    return True

# f2A('abcabcbcbc') //////////// not working 

def f2B(s):
    return set(s) == {'a','b','c','d'}

# how many numbers of 7 digits
# in 1000000 - 9999999
# contains only 3 diffirent digits 
# example: 1022221, 7577257, 8699968 ...

def f3() :
    counter = 0
    
    for n in range(1000000,10000000):
        if len(set(str(n))) == 3:
            counter += 1
    return counter

# print(f3())


def game () :
    import random 
    import datetime
    seconds = random. randint (6,12)
    print ('welcome to the game!') 
    print ('press enter twice')
    print (seconds, 'seconds between them!')
    input ()
    start = datetime.datetime.now ()
    input ()
    end = datetime.datetime.now ()
    print ()
    print (end-start)
    
game()