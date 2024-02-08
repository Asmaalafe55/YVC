# receive a string and return al list without duplicity 
# f1('qwerqwer rew r') --> ['q','w','e','r',' ']

def f1(s):
    L = []
    for letter in s:
        if letter not in L:
            L = L + [letter]
    return L


