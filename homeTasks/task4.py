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