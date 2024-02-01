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

