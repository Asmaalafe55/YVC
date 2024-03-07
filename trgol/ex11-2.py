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

