# Chapter 10

# print(ord('a'))
# print(ord('z'))
# print(chr(87))

# 1)
def f1(s):
    return s.count('m')
# print(f1('asdmosd'))
    
# 2)
def f2(s):
    counter=0
    counter += s.count('a')
    counter += s.count('o')
    counter += s.count('u')
    counter += s.count('i')
    counter += s.count('e')
    counter += s.count('A')
    counter += s.count('O')
    counter += s.count('U')
    counter += s.count('I')
    counter += s.count('E')
    return counter
# print(f2('aknsdakuOWE'))

# 3)
def f3(s):
    counter=0
    s= s.lower()
    for i in s:
        if ord(i) in list(range(ord('a'),ord('z')+1)):
            counter +=1
    return counter
# print(f3('abkj 21 dweknDF3!@ 4F'))

# 4)
def f4():
    s = input("please enter a string: ")
    a= s[0]
    b= s[len(s)-1]
    temp = a
    a= b
    b= temp
    s= list(s)
    s[0]= a
    s[len(s)-1] = b
    s= ''.join(s)
    return s
# print(f4('hello'))

# 5)

def f5():
    L=['']*4
    print(L)
    L[0] = input('word # : ')
    L[1] = input('word # : ')
    L[2] = input('word # : ')
    L[3] = input('word # : ')
    for i in range(4):
        print(L[i],end=' ')
    print()
    for i in range(3,-1,-1):
        print(L[i],end=' ')
    print()
    for i in range(3,-1,-1):
        for j in range (len(L[i]),-1,-1):
            print(L[j],end=' ')
        print(' ')
# f5() # needs to check 

# 6)

def f6(s):
    s=s.lower()
    set1=set(s)
    set1.discard(' ')
    return len(set1)
# print(f6('NICE exercise'))
        
    
# 7)
def f7():
    string = input ("enter a string: ")
    string = string.replace(' ','')
    # set1 = set()
    # for letter in string:
    #     set1.add(letter)
    apper = set(string)
    print('Apper: ',''.join(apper))
    notApper = set()
    for i in list(range(ord('a'),ord('z')+1)):
        if chr(i) not in apper:
            notApper.add(chr(i))
    print('notApper: ',''.join(notApper))   
# f7()

def f7A():
    set1 =set()
    s=input('Enter a text: ')
    for i in s:
        if i!=' ':
            set1.add(i)
    appear=''
    not_appear =''
    for i in 'qwertyuioplkjhgfdsaxzcvbnm':
        if i in set1:
            appear +=i
        else:
            not_appear+=i
    print('appear: ',appear)
    print('not appear: ',not_appear)
# f7A()