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

# 10) write a function that receives a list of numbers
# it will print in one line the sum of each pairs
# L=[3,9,1,22,-5,3] --> 12 10 23 -2

def sum_pair(L):
    for i in range(len(L)-1):
        print(L[i]+L[i+1], end=" ")

# sum_pair([3,9,1,22,-5,3])

# 11) Take a list and print it each time with a member less
# (from the beginning) until an empty list is obtained
# empty1([4,8,11,5]) 
# --> [4, 8, 11, 5]
# --> [8, 11, 5]
# --> [11, 5]
# --> [5]
# --> []

def empty1(L):
    for i in range(len(L)+1):
        print(L[i:])

# empty1([4,8,11,5]) 

# 12) Take a list and print it each time with a member less
# (from the end) until an empty list is obtained
# empty2([4,8,11,5]) 
# --> [4, 8, 11, 5]
# --> [4, 8, 11]
# --> [4, 8]
# --> [4]
# --> []

def empty2(L):
    for i in range(0,len(L)+1):
        print(L[:len(L)-i])

# empty2([4,8,11,5]) 

# 13) Take a list and print from it the numbers that are big
# more than the one after them in the list (next in line)
# bigger([40,8,11,5,2]) --> 40 11 5

def bigger(L):
    for i in range(len(L)-1):
        if L[i]>L[i+1]:
            print(L[i])
        
# bigger([40,8,11,5,2])

# 14) Take a list and print hems in pairs 
# (no overlap between the pairs!). If the number
# of members is even, the last one will appear as it is
# mul_pairs([7,8,3,3,2,9]) --> 56 9 18
# mul_pairs([3,8,4,5,7]) --> 24 20 7

def mul_pairs(L):
    for i in range(0,len(L)-1,2):
        print(L[i]*L[i+1], end=" ")
    if len(L)%2==1:
        print (L[-1]*1)
        
# mul_pairs([7,8,3,3,2,9])
# mul_pairs([3,8,4,5,7])

# 15) Pick up a string and print the characters in
# it, each letter in a separate line with a number starting from 1

def char_numbered(s):
    for i in range(len(s)):
        print(i+1, s[i])

# char_numbered('Mnbv')

# 16) Pick up two words and print their letters alternately.
# What remains of the longer word (if any) will be printed at the end
# two_words('abc','XYZ') --> aXbYcZ
# two_words('ABCDE','pp') --> ApBpCDE

def two_words(s1,s2):
    word=""
    longer=""
    shorter=""
    if len(s1)>len(s2):
        longer = s1
        shorter = s2
    else :
        longer = s2
        shorter = s1
    index=0
    for i in range(len(shorter)):
        word+=longer[i]
        word+=shorter[i]
        index=i
    word+=longer[index+1:]
    
    print(word)
    
# two_words('abc','XYZ')
# two_words('ABCDE','pp')

# 17) Pick up a word and print its characters alternately - 
# one from the beginning and one from the end.
# mix('abcdefgh') --> ahbgcfde
# mix('qwert1234') --> q4w3e2r1t

def mix(s):
    word=""
    for i in range((len(s)//2)):
        word+=s[i]
        word+=s[len(s)-i-1]
    if len(s)%2==1:
        word+=s[(len(s)//2)]
    print(word)

# mix('abcdefgh')
# mix('qwert1234')