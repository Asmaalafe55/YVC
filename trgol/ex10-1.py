def f():
    l = [1,5,4,3,2]
    l= sorted(l)
    print(l)

    l = [1,5,4,3,2]
    l.sort()
    print(l)
    print(l.index(2))
    lengths=set(3,4,5)
    lengths.add(2)
    print(lengths)
    

# Chapter 11

def f10(L):
    lengths = set()
    result = []
    for i in L:
        lengths.add(len(i))
    
    for i in sorted(lengths):
        sub_list = []  # list that receives all the strings that are same in length
        for string in L:
            if len(string) == i:
                sub_list.append(string)
        sub_list.sort()
        result.append(sub_list) # at the end add the sub list to the result
        
    return result

print(f10(['qwer','zzz','poiuytr','ghj','abc','qq','hjkl']))