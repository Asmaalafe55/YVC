# Chapter 9 

# 3) 

def f3(N):
    s = set()
    num = str(N)
    for i in range(len(num)):
        for j in '0123456789':
            if i!=0 and j!= "0" and new_number!=N:
                new_number= int(num[:i] + j + num[i+1:])
            # if len(str(new_number)== len(num)):
                s.add(new_number)
        s=s- {N, min(s)}
    return s