import unicodedata
print(unicodedata.name('ד'))
print(chr(22223))
print(chr(128554))
x= 'b'
b= 10
print(eval(x)+1)
y ='[12,10,20]'
print(type(y))
print(type(eval(y)))
print(type(eval(y)[0]))

for A in [12,45,30]:
    for op in '+-*':
        for B in [6,9]:
            print(A, op, B,'=',eval(str(A)+op+str(B)))

print(type(eval('"5"')))
print('+++++89798jb+86896+++'.strip('+'))
print('7'.isdigit())


def f29(s):
    s2=''
    for tav in s:
        if tav in '0987654321':
            s2+= tav
        else:
            s2+= ' '
    summ = 0
    for n in s2.split():
        summ+= int(n)
    return summ
print(f29('hgdgy645dc'))