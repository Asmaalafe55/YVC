# Chapter 11

# 22)

def f22(L):
    sol =[ ['00','01','02'],['10','11','12'],['20','21','22'],['00','10','20'],['01','11','21'],['02','12','22'],['00','11','22'],['22','11','00']]
    X=[' ']*3
    O=[' ']*3
    for i in range(len(L)):
        for j in range(len(L[i])):
            if L[i][j]=='X':
                X[i]= str(i)+str(j)
            if L[i][j]=='O':
                O[i]=str(i)+str(j)
    if X in sol:
        print('X won')
    elif O in sol:
        print('O won')
    else:
        print('Nobody won')

f22(['X  ','OX ',' OX'])