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

# 14)
def minimum(L):
    n = L[0]
    for i in L:
        if i<n:
            n=i
    return n

def f14(L):
    Lst = []
    for l in L:
        Lst += [minimum(l)]
    return Lst

# print(f14([[11,4,55],[7,7,8],[90],[10,20,44]]))

# 17)

def f17(L):
    Lst =[]
    for i in L:
        for j in i:
            Lst += [j]
    return Lst

# print(f17([[1,8],['w'],[4,'a',0]]))

# 18)

def f18(L):
    counter=0
    Lst = f17(L)
    for i in Lst:
        if i%2==0:
            counter +=1
    return counter

# print(f18([[1,2,3],[44,66,88],[99]]))

# 19)

def f19(L):
    Lst = f17(L)
    lst=[]
    for i in Lst:
        if i%2!=0:
            lst+=[i]
    return lst

# print(f19([[1,2,3],[44,66,88],[99]]))

# 20)
def two_letters(n):
    n=str(n)
    if len(n)==2:
        return True
    return False

def f20(L):
    Lst = f17(L)
    sumi =0
    for i in Lst:
        if two_letters(i):
            sumi +=i
    return sumi

# print(f20([[11,20,3],[444,666,80],[900,55]]))

# 21)

def f21(L):
    l=[]*2
    l += [len(L)]
    l += [len(L[0])]
    return l

# print(f21([[11,20],[444,666],[900,55]]))    

# 23) 

def f23(L):
    cols = len(L[0])
    sums =[0] * cols 
    for i in range(len(L)):
        for j in range(len(L[i])):
            sums[j] += L[i][j]
    return sums

# print(f23([[1,2,1,1],[2,3,2,3],[4,5,4,5]]))

# 25)

def f25(L):
    cols = len(L[0])
    lst = [0]*cols
    mid =0
    for i in range(len(L)):
        for j in range(len(L[i])):
            mid = L[i][i]
        lst[i] = mid
    return lst

# print(f25([[1,2,3],[4,5,6],[7,8,9]]))
    
    



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