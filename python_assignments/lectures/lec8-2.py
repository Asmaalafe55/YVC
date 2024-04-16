# Chapter 9

# 29) 

def f29 ():
    N = int(input("Enter number: "))
    for i in range(N):
        x= 11+10*i
        for j in range(i+1):
            print (x, end=" ")
            x=x+i
        print()   
# f29()


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

def has_aeiou(word):
    for letter in 'aeiou':
        if letter not in word:
            return False
        return True
    
def f(L1):
    L2 =[]
    for w in L1:
        if has_aeiou(w):
            L2 = L2 +[w]
    return L2

# print(f(['aoiuie','jhvoyi','jkizaeou']))

#  write a function that receives from the user how many words he wants
# to ask and he writes the words. and 