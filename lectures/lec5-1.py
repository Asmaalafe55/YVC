#  write a function that recieves a list of numbers and it will print them
# In non-overlapping pairs, and if there is an exception, then print it alone

def ex1(L):
    for nm in range(0,len(L),2):
        print(L[nm:nm+2])

# ex1([4,8,66,55,3,1])


# write a function that recieves 2 lists with the same length
# names of people and places
# print who is living and where
# f(['Qwe','Rty','Asdf'],['TLV','JLM','Nof-Hagalil'])
# --> Qwe lives in TLV

def ex2(L1,L2):
    for i in range(len(L1)):
        print (L1[i], "lives in ", L2[i])

# ex2(['Qwe','Rty','Asdf'],['TLV','JLM','Nof-Hagalil'])

# write a function that receives a word and print the word in different rows 
# but in each row delete one letter from the word
# f('zxcvb') --> xcv zcv zxv zxc

def ex3(word):
    for i in range(len(word)):
        print(word[:i]+word[i+1:])
        
# ex3("word")