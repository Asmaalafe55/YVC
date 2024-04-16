def f3 (L) :
    print ('there are', len (L), 'words:')
    for i in range (len (L)) :
        print ()
        print ('word #' ,i+1, ': ', L[i], sep='')
        print ('letters:', end = ' ')
    for j in range (len (L[i])):
        print (j+1,L[i][j],sep='', end = ' ')
    print ()
    print ('*'*20)
    
def f4A (height, width):
    x=11
    for i in range(height):
        for j in range (width):
            print((x), end=" ")
            x+=1
        print()
        
def f4B (height, width):
    for i in range(height):
        for j in range (width):
            print(11+j +i*width, end=" ")
        print()
        
def f7 ():
    for A in range(1,100):
        for B in range(100,1000):
            C = A*B
            s = str(A) + str(B) + str(C)
            if set(s)==set('0123456789'):
                print(A, 'x ',B,'= ', C)

f7()