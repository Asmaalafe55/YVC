# Chapter 11

# 3) Write a function that will receive as parameters two lists: a list of names (strings)
#  and a list of ages (integers). The lists are organized according to the first name
#  corresponds to the first age, the second to the second, etc. The function should return:
#  What is the name of the oldest person? It can be assumed that the names and ages in the
#  lists are different from each other.

def f3(names,ages):
    # index_age = ages.find(max(ages)) // find is a method that only working on strings not arrays
    maximum_age=max(ages)
    index_age=0
    for i in range(len(ages)):
        if ages[i]==maximum_age:
            index_age=i
    name = names[index_age]
    return name

# print(f3(['a','b','c','d'],[1,4,7,2]))

# 5) Take 2 lists, return a sorted list with the members that are in one list but
#  not in the other (no duplicates in the target list)

def f5(L1,L2):
    L=[]
    for i in L1:
        if i not in L2 and i not in L:
            L.append(i)
    for i in L2:
        if i not in L1 and i not in L:
            L.append(i)
    L.sort()
    return L

# print(f5([3,5,6,6,6],[3,3,4,4,6,9,11]))

# 6) Return a list with all possible sums (no duplicates, from smallest to
#  largest) of one member of each list.

def f6(L1,L2):
    L=[]
    for i in L1:
        for j in L2:
            if i+j not in L:
                L.append(i+j)
    L.sort()
    return L

# print(f6([4,10],[1,7,100]))

# 7) Take 2 lists, return a sorted list of numbers from some list, the number of
#  which is greater than 10 appears in the other list

def f7(L1,L2):
    L=[]
    for i in L1:
        if i+10 in L2:
            L.append(i)
    for i in L2:
        if i+10 in L1:
            L.append(i)
    L.sort()
    return L

# print(f7([12,13,15],[3,7,9,22,25,35]))

