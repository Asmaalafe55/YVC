# write a function that receives a list and it will print all of it 
# ex1([1,7,66]) --> 1 7 66

def ex1(List):
    for i in List:
        print(i, end=" ")

# ex1([1,7,66])       

# with the index of the parameter
def ex1B(List):
    for i in range(len(List)):
        print (List[i], end=" ")

# ex1B([1,7,66])

# receive a list and print all of ot except the fourth one
# ex2([4,8,11,345,456,5678,12,345]) 
# --> 4 8 11 456 5678 12 345

# option A
def ex2A(L):
    for i in range(len(L)):
        if(i != 3):
            print (L[i], end=" ")

# ex2A([4,8,11,345,456,5678,12,345]) 

# option B, without index (this is not effective for the memory)
def ex2B(L):
    for num in (L[:3]+ L[4:]):
        print(num, end=" ")
            
# ex2B([4,8,11,345,456,5678,12,345]) 

# write a function that receives a string and if there is an "s" or "S" in it
# print the letter with the letters around
# ex3('dsWsdftyuukfsb') --> dsW Wsd fsb
# ex3('sWlkjlisbfgRs') --> sW isb Rs
# ex3('mnbvcsstw') --> css sst

def ex3(s):
    for i in range(len(s)):
        # if s[i]=='s' or s[i]=='S':
        if s[i] in 'sS':
            if i==0:
                 print(s[:2], end=' ')
                 
            # Attention : the last one it will print with no errors
            # print(s[i-1],s[i],s[i+1], sep="")
            print(s[i-1:i+2], end=' ')

# ex3('dsWsdftySuukfsb')
# ex3('sWlkjlisbfgRs')
# ex3('mnSbvcsstw')

# write a function that receives numbers and print the numbers that are 
# larger from the two around
# ex4([123,45,8,8,7,12,4,1,9,2,67,99,88,100])
# --> 12 9 99

def ex4(L):
    for i in range(1,len(L)-1):
        if L[i-1] < L[i] > L[i+1]:
            print(L[i], end=" ")
            
# ex4([123,45,8,8,7,12,4,1,9,2,67,99,88,100])