# in page 8
def f9():
    lst = []
    steps = 0
    while len(lst) < 4:
        steps = steps + 1 # steps += 1
        number = int (input ("enter a number"))
        if (number > 1 and number <= 4 and number not in lst):
            lst = lst + [number] # 1st += [number]
            #1st. append (number)
    print(" 1 - 4 have arrived after", steps, "inputs")

# f9()

# in page 9

 # 4)
 
def q4():
    string = input("Enter a word: ")
    lines = int(input("How many lines? "))
    for line in range(lines+1):
        print()
        for tav in string:
            print(tav + line * ' ' , end='')
            
# q4()

# 4)

def f4(L1,L2):
    max=L1[0]*L2[0]
    for i in range(0,len(L1)):
        for j in range(0,len(L2)):
            if L1[i]*L2[j]>max:
                max = L1[i]*L2[j]
    return max

# print(f4([-3,2,4],[-7,-10,2]))