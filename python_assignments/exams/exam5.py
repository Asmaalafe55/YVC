# f2
def q2(s):
    result=''
    names =['zero','one','two','three','four','five','six','seven','eight','nine']
    for i in s:
        if i in '0123456789':
            result +=names[int(i)] + ' '
    return result

# print(q2('1 - d 3455'))

def q4():
    letters = set()
    print('Enter word: ')
    counter = 0 
    while len(letters)<26:
        user_input = input('')
        counter+=1
        user_input.lower()
        letters = letters | set(user_input)
    print('Nice, all the letters in', counter, 'words!')

# q4()

def q3(s):
    teams = s.split("vs")
    team1 = teams[0]
    team2 = teams[1].split(' ')[0]
    scores = teams[1].split(' ')[1]
    # print(team2)
    score1 = scores.split(":")[0] # 108
    score2 = scores.split(":")[1] # 110
    
    if(score1>score2):
        print(team1,'won by',score1-score2,'points')
    else: 
        print(team2,'won by',score2-score1,'points')
q3('Ma vs Wa 108:110') # here we have an error / a small exption