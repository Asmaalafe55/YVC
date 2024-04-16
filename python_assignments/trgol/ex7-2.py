# in chapter 8
def f9():
    lst = []
    steps = 0
    while len(lst) < 4:
        steps = steps + 1 # steps += 1
        number = int (input ("enter a number"))
        if (number > 1 and number <= 4 and number not in lst):
            lst = lst + [number] # 1st += [number]
            #1st. append (number)
    print(" 1 - 4 have arrived after", steps, "inputs")

# f9()

# in chapter 9

 # 1)
 
def q4():
    string = input("Enter a word: ")
    lines = int(input("How many lines? "))
    for line in range(lines+1):
        print()
        for tav in string:
            print(tav + line * ' ' , end='')
            
# q4()

# 4)

def f4(L1,L2):
    max=L1[0]*L2[0]
    for i in range(0,len(L1)):
        for j in range(0,len(L2)):
            if L1[i]*L2[j]>max:
                max = L1[i]*L2[j]
    return max

# print(f4([-3,2,4],[-7,-10,2]))


# 5)

def f5(L1,L2):
    counter=0 
    for i in range(len(L1)):
        for j in range(len(L2)):
            if L1[i]*L2[j]>48 and L1[i]*L2[j]<75:
                counter+=1
    return counter

# print(f5([1,2,5,7,10],[2,7,8,11]))


# 6)

def f6(L1,L2):
    min=0 
    for i in range(len(L1)):
        for j in range(len(L2)):
            if L1[i]-L2[j]< min:
                min = L1[i]-L2[j]
            if L2[i]-L1[j]< min:
                min = L2[i]-L1[j]
    return min

# print(f6([31,82,146],[7,40,200,1789])) ///// to check

# 9)

def f9(word):
    for i in range(len(word)):
        print (word[:i]+ '*' + word[i+1:])

# f9('abcd')

# 10)

def f10(L):
    sum = 0
    for i in range(len(L)):
        for j in range(len(str(L[i]))):
            word = str(L[i])
            l = int(word[j])
            sum = sum + l   
        if sum == 34:
            return True
        sum = 0
    return False

# print(f10([1234,567,899]))
# print(f10([0,67,35899])) 

# 12) 

def f12(L):
    for i in range(len(L)-1):
        for j in range(i+1,len(L)): 
            if L[i]+L[j]==100:
                return True
    return False

# print(f12([84,111,78,65]))
# print(f12([84,111,78,66])) // to check

         

