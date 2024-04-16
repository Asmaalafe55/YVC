# 3)

def f3(L):
    lst1=[]
    for l in L:
        s = set()
        for j in l:
            if l.count(j)>1 and j not in s:
                s.add(j)
            if len(s)>1:
                lst1.append(l)
                break;   
    return lst1

# print(f3(['banana','pool','tweet','parper']))

