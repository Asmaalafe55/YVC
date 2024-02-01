# 7) receive a list of items and return a similar list but witout the first and the last items
# mid(['q',2,0.2,'',7]) --> [2,0.2,'']

def mid(List):
    return List[1:len(List)-1]

# print(mid(['q',2,0.2,'',7]))

# 8) receive a string and print the letters in the odd index and the letters in the even index
# f1('QwertyU') --> QetU wry

def f1(s):
    even = ""
    odd = ""
    for i in range(len(s)):
        if i%2==0:
            even+= s[i]
        else :
            odd+= s[i]
    print(even)
    print(odd)
    
# f1('QwertyU')

# 9) Write a function that will receive a string and it will print in one line all the 3-letter sequences contained in it 
# seq3('QwerTY') --> Qwe wer erT rTY

def seq3(s):
    for i in range(len(s)-2):
        if i==0:
            print (s[:3], end=" ")
        else:
            print (s[i:i+3] , end=" ")

# seq3('QwerTY')

# write a function that receives a list of numbers
# it will print in one line the sum of each pairs
# L=[3,9,1,22,-5,3] --> 12 10 23 -2

def sum_pair(L):
    for i in range(len(L)-1):
        print(L[i]+L[i+1], end=" ")

# sum_pair([3,9,1,22,-5,3])

