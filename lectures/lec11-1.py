#Chapter 11

# f11
def f16(L):
    print(L)
    while L:
        print(L)
        while L[0]: 
            L[0].remove(L[0][0])
            print(L)
        L.remove(L[0])
    print(L)

# f16([[8,6],[1,2,3],[9]])



