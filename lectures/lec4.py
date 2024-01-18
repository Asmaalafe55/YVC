# write a function that recives 2 lists as parameters 
# it will print which one of them is empty
# g([2,4],[]) -> only the seconed empty
# g([],[]) -> the tow empty

def g(L1,L2):
    if L1:
        if L2:
            print ("the two full")
        print ("only the seconed one is empty")
    else :
        if L2:
            print ("only the first one is empty")
        print("the two is empty")

g([1],[])

# Write a function that receives from the user, gender, how much cigarettes, sport per week
# and the function will print until what age he will live
# # Men: 80, Women: 83
# Each time per week you do sport, you get another day (max 5)
# Each sigaret per day - minux one year (max 20)
# ex - woman, 2 sport, 23 cig -- 65
# ex - man, 8 sport, 1 cig, -- 84

def life():
    gender = input ("Whats your gender: ")
    sport = int(input ("Weekly sport: "))
    cig = int(input ("Daily smoke: "))
    
    age = 80
    if gender == 'woman':
        age+=3
        
    if sport > 5 :
        age+=5
    else:
        age+=sport
        
    if cig>20 :
        age-=20
    else:
        age-=cig
        
    print ("You will live until the age of ", age)
    
life()