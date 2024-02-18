# Chapter 9

# 13( Take two lists and return a list that will count for each number in the first list,
# how many numbers in the second list is greater)

def f13(L1,L2):
    counter = 0
    L=[]
    for i in L1:
        for j in L2:
            if i >j:
                counter +=1
        L+= [counter]
        counter = 0
    return L
    
# print(f13([1,23,100],[7,12,20,23,55,66,90,123,900]))

# 15) Take a list of lists, where each list contains words.
# Return one list, with the total length of all words in each list separately.

def f15 (L):
    length = 0
    L1 = []
    for i in L:
        for j in i:
            length += len(j)
        L1 += [length]
        length = 0 
    return L1    
            
# print(f15([['a','bc'],['qwerty'],['asd','poiu','jj']]))


