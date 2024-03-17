# 1)

def f1(L,n):
    nearest=abs(L[0]-n)
    num=L[0]
    for i in L:
        if abs(i-n) < nearest:
            nearest= abs(i-n)
            num = i
    return num

# print(f1([6.9,2.5,10,-4,23],8.8))

def f2(n):
    num ='0987654321'
    o_num = str(n)
    for i in num:
        if i in o_num:
            if int(i)%2==0:
                if o_num.count(i)%2==1:
                    return False
            elif int(i)%2==1:
                if o_num.count(i)%2==0:
                    return False
    return True

# print(f2(111223))
# print(f2(1213241445))

def f3(s):
    L=[]
    for i in s:
        if s.count(i)==1:
            L+= [s.find(i)]
    return L

# print(f3('aabcdbefbfc'))

def f4(s):
    s=s.split(' ')
    flag1=0
    for i in s:
        for j in i:
            if ord(j)<ord('a') or ord(j)>ord('z'):
                flag1=1
        for j in i:
            if ord('z')>ord(j)>ord('a') and flag1==1:
                return False
        flag1=0
    
    return True

# print(f4('12 word 098e'))