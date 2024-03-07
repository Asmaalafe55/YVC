# Chapter 11 

# f13
def f13(L):
    lowest=['',100] # [name,score]
    highest= ['',0]
    mini_avg = ['',100]
    maxi_avg = ['',0]

    for l in L:
        mini = min (l[1:])
        maxi = max(l[1:])
        if mini < lowest[1]:
            lowest[0] = l[0] # name
            lowest[1] = mini # score
        if maxi > highest[1]:
            highest[0] = l[0] # name
            highest[1] = maxi # score
        average = sum(l[1:])/len(l[1:]) 
        if average< mini_avg[1]:
            mini_avg[0] = l[0]
            mini_avg[1] = average
        if average > maxi_avg[1]:
            maxi_avg[0] = l[0]
            maxi_avg[1] = average
            
    print(lowest[0], 'got lowest grade')
    print(highest[0], 'got highest grade')
    print(mini_avg[0], 'got lowest average')
    print(maxi_avg[0], 'got highest average')
    
# f13([['Alfano',45,10],['Boito',7,56,89],['Cilea',99,22,21],['Donizetti',78,66,88,90,84]])


def f20(current,floors):
    up = []
    down = []
    for floor in floors:
        if floor >= current:
            up.append(floor)
        else:
            down.append(floor)
    return sorted(up) + sorted(down)[::-1] # [from: to(inc.): steps]
    # return (up.extend(down))[::-1] # [from: to(inc.): steps]
    
# print(f20(8,[2,3,9,7,1])) 

def f21A(lst):
    result =[]
    for i in range(len(lst)):
        for j in range(len(lst)):
            temp = [] # temporary list for each pair
            temp.append(lst[i])
            temp.append(lst[j])
            result.append(temp)
    return result

# print(f21A([3,6,7,9]))

def f21A2(lst):
    result =[]
    for i in range(len(lst)):
        for j in range(len(lst)): 
            result.append([lst[i],lst[j]])
    return result

# print(f21A2([3,6,7,9]))

def f21B(lst):
    result =[]
    for i in range(len(lst)):
        for j in range(i,len(lst)):
        # for j in range(len(lst[i:])):
            result.append([lst[i],lst[j]])
    return result

# print(f21B([3,6,7,9]))