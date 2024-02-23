
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