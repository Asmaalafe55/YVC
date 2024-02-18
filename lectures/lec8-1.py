# Chapter 9

def f1(n):
    shoresh = str(n**0.5)
    return shoresh[:-2] == '.0'
    
def f2(n):
    shoresh = str(n**0.5)
    return int(shoresh) == shoresh
    
def f3 (n):
    return (n**0.5) %1 == 0

def f4():
    A=[]
    B=[]
    C=[]
    
    for i in range(1,32):
        if 10<i**2<100:
            A = A + [i**2]
        if 0<i**2<1000:
            B = B +  [i**2]
        if 0<i**2<100:
            C = C + [i**2]
        
        for a in A:
            for b in B:
                for c in C:
                    number = a*100000 +b*100 +c
                    if f3(number):
                        print(number)

# a rectangle with a height H and a width W
# without the first corner in the left

def f5(H,W):
    for i in range(H):
        for j in range(W):
            if i ==0 and j==0:
                print(' ', end=' ')
            else :
                print('*', end=' ')
        print ()
    print()
    # col with *, col without
    for i in range(H):
        for j in range(W):
            if j%2==0:
                print('*', end=' ')
            else :
                print(' ', end=' ')
        print()
    print()
    # row with *, row without
    for i in range(H):
        for j in range(W):
            if i%2==0:
                print('*', end=' ')
            else :
                print(' ', end=' ')
        print()
    print()
    # only the border
    for i in range(H):
        for j in range(W):
            if i==0 or j==0 or i==H-1 or j==W-1:
                print('*', end=' ')
            else :
                print(' ', end=' ')
        print()
    print()
    # only the border
    for i in range(H):
        for j in range(H):
            if i==0 or i==H-1 or j==i  or j+i==H-1:
                print('*', end=' ')
            else :
                print(' ', end=' ')
        print()
    print()
    
f5(6,5)