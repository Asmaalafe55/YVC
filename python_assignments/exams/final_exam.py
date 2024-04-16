def f1(n):
    for i in range(1,2*n):
        if(i<n):
            print('(',i,sep='',end='')
        if(i==n):
            print('(',i,')',sep='',end='')
        if(i>n): # else is a mistake
            print(i,')',sep='',end='')

# f1(5)

def f2(L):
    maximum = max(L)
    minimum = min(L)

    for i in range(minimum,maximum+1):
        if i not in L:
            return False
    return True
        
# print(f2([1,5,2,4,1,4]))

def f3(L):
    person1=''
    person2=''
    for i in range(len(L)):
        person1=L[i][0]
        person2=L[i][1]
        for j in range(len(L)):
            if L[j][0]==person2 and L[j][1]==person1:
                print('Its a match',person1,'and',person2,'like each other')
                # a mistake, it prints the same two persons twice
                # i should put the persons in a list and the to print

# f3([['a','b'],['b','a'],['c','a'],['d','b']])
                
def f41(n):
    return 6/n
def f42(n):
    return 2-n
def f43(n):
    return n+1
                
def f4():
    L=[]
    s= input("Enter numbers :")
    L= s.split(' ')
    lst=[]
    counter=0
    for i in L:
        if 6/float(i)>0:
            counter +=1
        if 2-float(i)>0:
            counter+=1
        if float(i)+1>0:
            counter+=1
        if counter==2:
            lst+=[float(i)]
        counter=0 # this is a mistake, i should put it in the outside loop
    return lst 

# print(f4())
