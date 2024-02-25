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
    
    