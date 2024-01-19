# 7) Write a program that will ask the user some questions and print an appropriate report.
# It will find out if :
# - He drinks coffee, and if so, ask how much. Then ask if he drinks tea
# and again only if he answered "yes", ask how many cups a day. 
# (If he doesn't drink any drink, don't ask how much!).
# Assume that the user's only answers are yes / no and integers for the quantities.
# Use the examples to see the 4 possible outputs.

def coffee_tea():
    coffee_answer = input("Do you drink coffee? ")
    if coffee_answer=='yes':
        coffee_num = int(input("How many cups per day? "))

    tea_answer = input("Do you drink tea? ")
    if tea_answer=='yes':
        tea_num = int(input("How many cups per day? "))
        
    if coffee_answer=='yes' and tea_answer=='yes':
        print("You drink both coffee and tea, together ", coffee_num+tea_num, "cups a day.")
    elif coffee_answer== 'yes' and tea_answer=='no':
        print("You drink coffee, ", coffee_num, "cups a day.")
    elif coffee_answer== 'no' and tea_answer=='yes':
        print("You drink tea, ", tea_num, "cups a day.")
    else :
        print("You don't drink coffee or tea at all.")
        
# coffee_tea()

