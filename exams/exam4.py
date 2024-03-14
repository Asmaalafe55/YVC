# q1 

def q1(N,L):
    # [11,88,90,23]
    i =0 
    while (len(L)<N**2):
       L.append(L[i])
       i+=1
    for i in range(0,len(L),N):
        for j in range(i, i+N):
            print(L[j], end=' ')
        print()
        

# q1(3,[11,88,90,23])
# q1(5,[9,7,2])
