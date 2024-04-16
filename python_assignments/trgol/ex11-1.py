# Chapter 10

# 30) Pick up a string and return how many of the letters A-Z appear in the string
#  as both an uppercase letter and a lowercase letter (both must appear)

def f30(s):
    s1=set()
    s2=set()
    for i in s:
        if i in 'qwertyuiopasdfghjklmnbvcxz':
            s1.add(i)
        if i in 'QWERTYUIOPLKJHGFDSAZXCVBNM':
            s2.add(i.lower())
    result = s1&s2
    return len(result)

# print(f30('AB Abcd Ee'))

# 31) Write a function that receives as a parameter a list of strings. Each string is actually
#  a sentence, consisting of words with spaces between them. It can be assumed that the words
#  contain only lowercase letters, and that the sentences have no punctuation marks at all
#  (only spaces). The function will return one list of all the words that appeared in the above
#  sentences, without duplicates, and in alphabetical order.

def f31(L):
    lst=[]
    for i in L:
        for j in i.split(' '):
            lst.append(j)
    temp = set(lst)
    lst= list(temp)
    lst.sort()
    return lst

# print(f31(['good day','how are you','have a nice day','you are nice']))

# 32) 

def f32(s,s1,s2):
    for i in s:
        if i in s1:
            index = s1.find(i)
            print(s2[index],i)
            s = s.replace(i,s2[index])
    return s

# print(f32('Aaa bob Ccc qwer','abc','cZa'))
            
# 38) Pick up a string and print it as each time it is shortened by a single character.
# At first, a character is deleted from the end, then a character is deleted from the beginning, and so on alternately

def f38(s):
    print(s)
    for i in range(len(s)):
        if i%2==0:
            s = s[:len(s)-1]
        else: 
            s= s[1:len(s)]
        print(s)
# f38('qwertyu')
        
