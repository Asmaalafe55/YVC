#Chapter 11

# 16) Write a function that will take in a list of lists (containing numbers) and slowly empty
#  it. It will print all the emptying steps, until an empty list is obtained. The members are
#  deleted one by one, after which the list that contained them is also deleted.

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



