# Chapter 10

# 8)

def f8(s):
    for i in range (len(s)):
        print(s[i],' '*(i+1),end='')

# f8('helo')

def f9(L1,L2):
    for i in range (len(L1)):
        for j in range(len(L1[i])):
            print(L1[i][j],end=L2[i])
        print(' ',end ='')
# f9(['hola','adios'],['@', 'zz'])

def f10():
    s= input("enter a word : ")
    for i in range(len(s)):
        if i%2==0:
            print(s[i].upper(),end='')
        else:
            print(s[i],end='')
    print()
# f10()

# 11)
def past(s):
    if(s[len(s)-1]=='e'):
        s+='d'
        return s
    if(s[len(s)-3:len(s)]=='eep'):
        s = s[:len(s)-2] + 'pt'
        return s
    s+='ed'
    return s

def f11(s):
    s=s.split(' ')
    i=1
    for string in s:
        print(i,string,past(string))
        i+=1

# f11('sleep drink love')


