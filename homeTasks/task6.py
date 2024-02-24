# 2) 
def hezqa(n):
    return 2**n
def sequence(j,s,i):
    j = str(j)
    if j*2 in s:
        return i
    return False
def f2():
    num = []*101
    for i in range(101):
        num += [str(hezqa(i))]
    for j in range(10):
        k=str(j)
        print ('The sequence in',k*2,'appers in these powers of 2: ', end ='')
        for i in range(101):
            if sequence(j, num[i],i):
                print (i,' ', end ='')
        print()
            
# f2()

# 5)

def f5(L1,L2):
    counter=0 
    for i in range(len(L1)):
        for j in range(len(L2)):
            if L1[i]*L2[j]>48 and L1[i]*L2[j]<76:
                counter+=1
    return counter

# print(f5([1,2,5,7,10],[2,7,8,11]))

# 6) 

def negative(n):
    if n<0:
        return -n
    else: 
        return n

def f6(L1,L2):
    min = L1[0]-L2[0]
    for i in L1:
        for j in L2:
            if negative(i-j)<min:
                min= negative(i-j)
            if negative(j-i)<min:
                min = negative(j-i)
    return min

# print(f6([31,82,146],[7,40,200,1789]))

# 10)
def sumi(n):
    s=0
    n=str(n)
    for l in n:
        s += int(l)
    return s

def f10(L):
    for i in L:
        if sumi(i) == 34:
            return True
    return False

# print(f10([1234,567,899]))
# print(f10([123,67,35899]))

# 11)

def f11(L):
    for i in range(len(L)-1):
        if L[i]+L[i+1] ==100:
            return True
    return False

# print(f11([30,87,111,70,9]))
# print(f11([30,87,13,70,91]))




# 23) 
def f23(L):
    print(L)
    cols = len(range(L[0]))
    sums =[0] * cols
    for l in range(len(L)):
        for j in range(l):
            sums[j] = sums[j] + L[l][j]
    return sums

# print(f23([[1,2,1,1],[2,3,2,3],[4,5,4,5]]))
# to check this 

# 29) 
def f29D ():
    N = int(input("Enter number: "))
    for i in range(N):
        x= 11+10*i
        for j in range(i+1):
            print (x, end=" ")
            x=x+i
        print()   
# f29()